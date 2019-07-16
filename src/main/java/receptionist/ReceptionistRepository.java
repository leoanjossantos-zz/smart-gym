package receptionist;

import gymmember.GymMember;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ReceptionistRepository extends CrudRepository<GymMember, String> {

    Optional<GymMember> findByName(String name);

}
