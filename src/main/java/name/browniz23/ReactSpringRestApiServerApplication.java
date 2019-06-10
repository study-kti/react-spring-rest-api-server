package name.browniz23;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import name.browniz23.dao.*;
import name.browniz23.service.*;

@SpringBootApplication
public class ReactSpringRestApiServerApplication implements CommandLineRunner {
	
	@Autowired
	
	public static void main(String[] args) {
		System.out.println("sgg");
		SpringApplication.run(ReactSpringRestApiServerApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
    }
}
