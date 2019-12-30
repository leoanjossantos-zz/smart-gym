package smartgym.payment;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PaymentRepository extends CrudRepository<Payment, String> {

    Optional<Payment> findAllBy();

}
