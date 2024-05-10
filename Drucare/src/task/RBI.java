package task;

public class RBI {
	Customer customer;
	Account account;
	
	RBI(Customer customer,Account account)
	{
		this.customer=customer;
		this.account=account;
	}
	double getInterestRate() 
	{
		return 3.4;
	}
	double getWithdrawalLimit() {
		return 10000;
	}
}
