package amani.hadded.custumerServiceApplication;

import amani.hadded.custumerServiceApplication.models.Customer;
import amani.hadded.custumerServiceApplication.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustumerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null, "eni", "contact@eni.tn"));
			customerRepository.save(new Customer(null, "FST", "contact@fst.tn"));
			customerRepository.save(new Customer(null, "ENSI", "contact@ensi.tn"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}
