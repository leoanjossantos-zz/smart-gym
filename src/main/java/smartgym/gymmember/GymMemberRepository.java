package smartgym.gymmember;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface GymMemberRepository extends PagingAndSortingRepository<GymMember, String> {

    Optional<GymMember> findByName(@Param("name") String name);

}
