package gymmember;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GymMemberRepository extends CrudRepository<GymMember, String> {

    Optional<GymMember> findByName(String name);

}
