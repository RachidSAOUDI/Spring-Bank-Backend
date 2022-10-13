package ma.usmba.springbankbackend;

import ma.usmba.springbankbackend.entities.Customer;
import ma.usmba.springbankbackend.repositories.AccountOperationRepository;
import ma.usmba.springbankbackend.repositories.BankAccountRepository;
import ma.usmba.springbankbackend.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringBankBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBankBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            BankAccountRepository bankAccountRepository,
                            AccountOperationRepository accountOperationRepository){
        return args -> {
            Stream.of("Hassan", "Yassine", "Aicha").forEach(name->{
                Customer customer = new Customer();
                customer.setName(name);
                customer.setEmail(name+"@gmail.com");
                customerRepository.save(customer);
            });
        };
    }
}
