package smartgym.gymmember;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import smartgym.paymentplan.PaymentPlan;
import org.springframework.data.annotation.Id;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Objects;

public class GymMember {

    @Id
    private String id;

    private String name;
    private String cpf;
    private String identity;
    private String address;

    private PaymentPlan paymentPlan;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Date creationDate = new Date();

    public GymMember() {
    }

    public GymMember(String name, String cpf, String identity, String address, PaymentPlan paymentPlan) {
        this.name = name;
        this.cpf = cpf;
        this.identity = identity;
        this.address = address;
        this.paymentPlan = paymentPlan;
        this.creationDate = new Date();
    }

    public String getId() {
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

    public PaymentPlan getPaymentPlan() {
        return paymentPlan;
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

    public void setPaymentPlan(PaymentPlan paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public Date getCreationDate() {
        return creationDate;
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
                paymentPlan.equals(gymMember.paymentPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, identity, address, paymentPlan);
    }

    @Override
    public String toString() {
        return "GymMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", identity='" + identity + '\'' +
                ", address='" + address + '\'' +
                ", paymentPlan=" + paymentPlan +
                '}';
    }
}
