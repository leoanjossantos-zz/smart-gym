package smartgym.paymentplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import smartgym.payment.Payment;
import smartgym.payment.PaymentRepository;

import java.util.Optional;

@RestController
public class SmartGymController {

    private final PaymentRepository paymentRepository;

    @Autowired
    public SmartGymController(final PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    @GetMapping("/getAllPayments")
    public String getAllPayments(){
        Optional<Payment> foundPayments = paymentRepository.findAllBy();

        return foundPayments
                .map(payments -> String.format("Due payment: %t, Payment data: %t, Is this payed: %b ", payments.getDueDate(), payments.getPaymentDate(), payments.getPayed() ) )
                .orElse(String.format("There is no payments on the data base"));
    }


}
