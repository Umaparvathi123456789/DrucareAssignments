package task;



public class ICIC extends RBI {
	ICIC(Customer customer, Account account) {
		super(customer, account);
		// TODO Auto-generated constructor stub
	
	}
	public static void main(String[] args) 
	{
		Customer customer=new Customer("Janu", 25);
		Account account =new Account(453638,30000.0);
		
		RBI sbi=new SBI(customer, account);
		RBI icici = new RBI(customer, account);
		double sbiInterestRate = sbi.getInterestRate();
        double iciciWithdrawalLimit = icici.getWithdrawalLimit();

        System.out.println("SBI Interest Rate: " + sbiInterestRate);
        System.out.println("ICICI Withdrawal Limit: " + iciciWithdrawalLimit);
	}

}
