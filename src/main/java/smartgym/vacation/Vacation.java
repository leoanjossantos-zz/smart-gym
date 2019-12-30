package smartgym.vacation;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Objects;

public class Vacation {

    @Id
    private String id;

    private Date firstVacationPeriod;
    private Date endVacationPeriod;

    protected Vacation (){}

    public Vacation(Date firstVacationPeriod, Date endVacationPeriod) {
        this.firstVacationPeriod = firstVacationPeriod;
        this.endVacationPeriod = endVacationPeriod;
    }

    public String getId() {
        return id;
    }

    public Date getFirstVacationPeriod() {
        return firstVacationPeriod;
    }

    public void setFirstVacationPeriod(Date firstVacationPeriod) {
        this.firstVacationPeriod = firstVacationPeriod;
    }

    public Date getEndVacationPeriod() {
        return endVacationPeriod;
    }

    public void setEndVacationPeriod(Date endVacationPeriod) {
        this.endVacationPeriod = endVacationPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vacation)) return false;
        Vacation vacation = (Vacation) o;
        return Objects.equals(id, vacation.id) &&
                firstVacationPeriod.equals(vacation.firstVacationPeriod) &&
                endVacationPeriod.equals(vacation.endVacationPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstVacationPeriod, endVacationPeriod);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "id='" + id + '\'' +
                ", firstVacationPeriod=" + firstVacationPeriod +
                ", endVacationPeriod=" + endVacationPeriod +
                '}';
    }
}
