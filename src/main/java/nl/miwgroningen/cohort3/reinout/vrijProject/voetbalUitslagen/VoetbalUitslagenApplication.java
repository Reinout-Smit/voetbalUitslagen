package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository")
@SpringBootApplication
public class VoetbalUitslagenApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoetbalUitslagenApplication.class, args);
	}

}
