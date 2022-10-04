package Spring_Boot_Main;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository2 extends JpaRepository<BankTransactions, Integer> {

}
