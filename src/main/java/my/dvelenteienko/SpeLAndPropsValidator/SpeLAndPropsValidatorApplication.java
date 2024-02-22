package my.dvelenteienko.SpeLAndPropsValidator;

import my.dvelenteienko.SpeLAndPropsValidator.config.PropsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(PropsConfig.class)
public class SpeLAndPropsValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeLAndPropsValidatorApplication.class, args);
	}

}
