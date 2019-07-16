package trainer;

import gymmember.GymMember;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrainerRepository extends CrudRepository<GymMember, String> {

    Optional<GymMember> findByName(String name);

}
