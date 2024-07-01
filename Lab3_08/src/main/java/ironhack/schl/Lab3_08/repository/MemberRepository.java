package ironhack.schl.Lab3_08.repository;

import ironhack.schl.Lab3_08.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
