import org.springframework.context.annotation.Bean;

import com.qa.repository.AccountRepository;
import com.qa.repository.HibernateAccountRepositoryImpl;
import com.qa.service.AccountService;
import com.qa.service.AccountServiceImpl;


public class AppConfig {

	@Bean(name = "accountService")
	public AccountService getAccountService() {
		AccountServiceImpl service = new AccountServiceImpl();
		service.setAccountRepository(getAccountRepository());
		return service;
	}
	
	@Bean(name = "accountRepository")
	public AccountRepository getAccountRepository() {
		return new HibernateAccountRepositoryImpl();
	}
	
}
