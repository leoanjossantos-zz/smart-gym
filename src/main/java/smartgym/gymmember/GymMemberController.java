package smartgym.gymmember;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GymMemberController {

    private final GymMemberRepository gymMemberRepository;

    @Autowired private MongoTemplate mongoTemplate;

    public GymMemberController( GymMemberRepository gymMemberRepository ){
        this.gymMemberRepository = gymMemberRepository;
    }

    @PostMapping("/gymmembers")
    public GymMember newMember(@RequestBody GymMember newMember){
        return gymMemberRepository.save(newMember);
    }

    @PutMapping("/gymmembers/{id}")
    public GymMember updateGymMember( @PathVariable("id") String id, @RequestBody GymMember updateMember){
        Optional<GymMember> memberRepositoryById = gymMemberRepository.findById(id);

        if(memberRepositoryById.isPresent()){
            GymMember memberFromDatabase = memberRepositoryById.get();

            BeanUtils.copyProperties(updateMember, memberFromDatabase);

            return gymMemberRepository.save( memberFromDatabase);
        }

        throw new RuntimeException(String.format("Error updating member %s doesn't exist", id));
    }


    @GetMapping("/topten")
    public List <GymMember> newestTopTenMembers(){
        Query query = new Query();

        query.with(new Sort(Sort.Direction.DESC, "creationDate")).limit(10);

        List<GymMember> topTenGymMemberList =  mongoTemplate.find(query, GymMember.class);

        return topTenGymMemberList;
    }

    @DeleteMapping("/deleteall")
    public void deleteAllGymMembers(){
        gymMemberRepository.deleteAll();
    }


    @DeleteMapping("/delete/{id}")
    public GymMember deleteById( @PathVariable("id") String id){
        Optional<GymMember> memberToBeDeleted = gymMemberRepository.findById(id);

        if(memberToBeDeleted.isPresent()){
            gymMemberRepository.deleteById(id);
            return memberToBeDeleted.get();
        }

        return memberToBeDeleted.get();



    }


}
