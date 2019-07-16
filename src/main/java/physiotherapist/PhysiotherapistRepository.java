package physiotherapist;

import gymmember.GymMember;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PhysiotherapistRepository extends CrudRepository<GymMember, String> {

    Optional<GymMember> findByName(String name);

}
