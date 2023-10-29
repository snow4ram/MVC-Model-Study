package ajaxcontroller.prosettings.domain;

import lombok.Getter;

@Getter
public class Member {

    private Long id;

    private String name;

    private Integer age;

    public Member(final String name,final Integer age) {
        this.name = name;
        this.age = age;
    }

    public void updateId(Long id){
        if (id == null) {
            throw new IllegalArgumentException("값이 없습니다.");
        }

        this.id = id;
    }


    @Override
    public String toString() {
        return "Member | " +
                " name = " + name +
                " age = " + age +
                '|';
    }

}
