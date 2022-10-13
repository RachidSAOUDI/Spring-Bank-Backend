package ma.usmba.springbankbackend.repositories;

import ma.usmba.springbankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
