package mutlitap.media;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaApplication.class, args);
	}

}
