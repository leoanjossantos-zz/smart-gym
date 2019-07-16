package gymmember;

import paymentplan.PaymentPlan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class GymMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String firstName;
    private String lastName;

    private String name;
    private String cpf;
    private String id;
    private String address;

    private PaymentPlan typeOfPaymentPlan = new PaymentPlan();

    protected GymMember() {
    }

    public GymMember(String lastName, String name, String cpf, String id, String address, PaymentPlan typeOfPaymentPlan) {
        this.lastName = lastName;
        this.name = name;
        this.cpf = cpf;
        this.id = id;
        this.address = address;
        this.typeOfPaymentPlan = typeOfPaymentPlan;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTypeOfPaymentPlan(PaymentPlan typeOfPaymentPlan) {
        this.typeOfPaymentPlan = typeOfPaymentPlan;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public PaymentPlan getTypeOfPaymentPlan() {
        return typeOfPaymentPlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GymMember)) return false;
        GymMember gymMember = (GymMember) o;
        return firstName.equals(gymMember.firstName) &&
                lastName.equals(gymMember.lastName) &&
                name.equals(gymMember.name) &&
                cpf.equals(gymMember.cpf) &&
                id.equals(gymMember.id) &&
                address.equals(gymMember.address) &&
                typeOfPaymentPlan.equals(gymMember.typeOfPaymentPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, name, cpf, id, address, typeOfPaymentPlan);
    }

    @Override
    public String toString() {
        return "GymMember{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", typeOfPaymentPlan=" + typeOfPaymentPlan +
                '}';
    }

}
