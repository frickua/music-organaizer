package mo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.jsondoc.spring.boot.starter.*;

@SpringBootApplication
@EnableJSONDoc
public class MOApplication {

	public static void main(String[] args) {
		SpringApplication.run(MOApplication.class, args);
	}
}
