package name.browniz23;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;


@SpringBootApplication
public class ReactSpringRestApiServerApplication implements CommandLineRunner {
	
	@Autowired
	public static void main(String[] args) {
	//
		SpringApplication.run(ReactSpringRestApiServerApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
    }
}
