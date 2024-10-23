package amani.haddad.getwayService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetwayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayServiceApplication.class, args);
	}
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				// Direct routes to specific services
				.route(r -> r.path("/customers/**").uri("http://localhost:8081/"))
				.route(r -> r.path("/products/**").uri("http://localhost:8082/"))
				.build();
	}




}
