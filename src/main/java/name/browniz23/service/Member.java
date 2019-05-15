package name.browniz23.service;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
	private Integer age;
//  @Enumerated(EnumType.STRING)
//  private Grade grade;
  
    private Member() {}

    private Member(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
//        this.grade = grade;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

    public static Member join(@NonNull String name, @NonNull Integer age) {
        return new Member(name, age);
    }
}
