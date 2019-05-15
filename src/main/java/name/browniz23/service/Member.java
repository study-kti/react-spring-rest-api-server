package name.browniz23.service;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer age;

//    @Enumerated(EnumType.STRING)
//    private Grade grade;
    
    private Member() {}

    private Member(String name, Integer age) {
        this.name = name;
        this.age = age;
//        this.grade = grade;
    }

    public static Member join(@NonNull String name, @NonNull Integer age) {
        return new Member(name, age);
    }
}
