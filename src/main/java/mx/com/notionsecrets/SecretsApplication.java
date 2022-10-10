package mx.com.notionsecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import mx.com.notionsecrets.configsecrets.NotionConfigProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class SecretsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretsApplication.class, args);
	}

}
