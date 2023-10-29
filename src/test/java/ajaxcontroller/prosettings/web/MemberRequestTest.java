package ajaxcontroller.prosettings.web;

import ajaxcontroller.prosettings.domain.Member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class MemberRequestTest {

    @Test
    void create() {



        Member memberA = new Member("user A", 25);
        Member memberB = new Member("user B", 30);


        MemberRequest memberRequest = new MemberRequest("user A" , 25);

        Member member = memberRequest.createMember();

        Assertions.assertEquals(member , memberA);
    }
}