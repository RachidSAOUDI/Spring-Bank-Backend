package ma.usmba.springbankbackend.repositories;

import ma.usmba.springbankbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
