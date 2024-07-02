package ironhack.schl.Lab3_08.repository;

import ironhack.schl.Lab3_08.model.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static ironhack.schl.Lab3_08.model.Status.ACTIVE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    Member member;

    @BeforeEach
    void setUp() {
        member = new Member(1244,"Yoland", ACTIVE);
        memberRepository.save(member);

    }
    @AfterEach
    void tearDown() {
        memberRepository.deleteAll();
    }


    @Test
    public void findAll_chaptersPresent_chapterList() {
        Member newMember = new Member(5678, "Yoland", ACTIVE);
        memberRepository.save(newMember);
        List<Member> memberList = memberRepository.findAll();
        assertEquals(2, memberList.size());
    }

    @Test
    public void deleteById_validId_chapterDeleted() {
        memberRepository.deleteById(1234);
        Optional<Member> foundMember = memberRepository.findById(1234);
        assertTrue(foundMember.isEmpty());
    }


    @Test
    public void findById_invalidId_memberNotPresent() {
        Optional<Member> chapterOptional = memberRepository.findById(999);
        assertTrue(chapterOptional.isEmpty());
    }

}