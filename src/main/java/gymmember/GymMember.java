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
    private Integer id;

    private String name;
    private String cpf;
    private String identity;
    private String address;

    private PaymentPlan typeOfPaymentPlan = new PaymentPlan();

    protected GymMember() {
    }

    public GymMember(String name, String cpf, String identity, String address, PaymentPlan typeOfPaymentPlan) {
        this.name = name;
        this.cpf = cpf;
        this.identity = identity;
        this.address = address;
        this.typeOfPaymentPlan = typeOfPaymentPlan;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdentity() {
        return identity;
    }

    public String getAddress() {
        return address;
    }

    public PaymentPlan getTypeOfPaymentPlan() {
        return typeOfPaymentPlan;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTypeOfPaymentPlan(PaymentPlan typeOfPaymentPlan) {
        this.typeOfPaymentPlan = typeOfPaymentPlan;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GymMember)) return false;
        GymMember gymMember = (GymMember) o;
        return Objects.equals(id, gymMember.id) &&
                name.equals(gymMember.name) &&
                cpf.equals(gymMember.cpf) &&
                Objects.equals(identity, gymMember.identity) &&
                address.equals(gymMember.address) &&
                typeOfPaymentPlan.equals(gymMember.typeOfPaymentPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, identity, address, typeOfPaymentPlan);
    }

    @Override
    public String toString() {
        return "GymMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", identity='" + identity + '\'' +
                ", address='" + address + '\'' +
                ", typeOfPaymentPlan=" + typeOfPaymentPlan +
                '}';
    }
}
