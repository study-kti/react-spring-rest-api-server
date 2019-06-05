package name.browniz23;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import name.browniz23.dao.*;
import name.browniz23.service.*;

@SpringBootApplication
public class ReactSpringRestApiServerApplication implements CommandLineRunner {
	
	@Autowired
    private MemberRepository memberRepository;
	
	public static void main(String[] args) {
		System.out.print("commit1");
		SpringApplication.run(ReactSpringRestApiServerApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        memberRepository.save(Member.join("member1", 20));
        memberRepository.save(Member.join("member2", 21));
        memberRepository.save(Member.join("member3", 22));
        memberRepository.save(Member.join("member4", 23));
        memberRepository.save(Member.join("member5", 24));
    }
}
