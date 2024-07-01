package ironhack.schl.Lab3_08.repository;

import ironhack.schl.Lab3_08.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
