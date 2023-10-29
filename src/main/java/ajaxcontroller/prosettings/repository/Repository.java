package ajaxcontroller.prosettings.repository;

import ajaxcontroller.prosettings.domain.Member;
import ajaxcontroller.prosettings.web.MemberRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Repository {

    private final Map<Long, Member> list = new HashMap<>();

    private Long key = 0L;
    public void save(final MemberRequest request) {
        Member member = request.createMember();

        member.updateId(key);

        list.put(key, member);

        key++;

    }

    public Member findById(final Long findMember) {
        return list.get(findMember);
    }

    public List<Member> findAll() {
        return new ArrayList<>(list.values());
    }
}
