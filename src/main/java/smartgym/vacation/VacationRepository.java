package smartgym.vacation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface VacationRepository extends CrudRepository<Vacation, String> {

    Optional<Vacation> findAllBy();



}
