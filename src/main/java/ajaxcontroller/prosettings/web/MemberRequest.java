package ajaxcontroller.prosettings.web;

import ajaxcontroller.prosettings.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
public class MemberRequest {

    private String name;

    private Integer age;

    public MemberRequest(final String name, final Integer age) {
        this.name = name;
        this.age = age;
    }

    public Member createMember() {
        return new Member(getName(), getAge());
    }

    @Override
    public String toString() {
        return "MemberRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
