package smartgym.payment;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Objects;

public class Payment {

    @Id
    private String id;

    private Date dueDate;
    private Date paymentDate;
    private Boolean payed;

    public Payment (){}

    public Payment(Date dueDate, Date paymentDate, Boolean payed) {
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
        this.payed = payed;
    }

    public String getId() {
        return id;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Boolean getPayed() {
        return payed;
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id) &&
                dueDate.equals(payment.dueDate) &&
                Objects.equals(paymentDate, payment.paymentDate) &&
                Objects.equals(payed, payment.payed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dueDate, paymentDate, payed);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", dueDate=" + dueDate +
                ", paymentDate=" + paymentDate +
                ", payed=" + payed +
                '}';
    }
}
