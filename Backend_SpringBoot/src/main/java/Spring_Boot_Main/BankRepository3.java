package Spring_Boot_Main;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository3 extends JpaRepository<BankWithdrawal, Integer> {

}
