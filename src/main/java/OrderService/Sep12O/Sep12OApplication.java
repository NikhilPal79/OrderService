package OrderService.Sep12O;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sep12OApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sep12OApplication.class, args);
	}

}
