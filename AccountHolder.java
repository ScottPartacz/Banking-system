
public class AccountHolder {
	
	static double annualInterestRate = 0;
	
	double balance;

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		AccountHolder.annualInterestRate = annualInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * makes the object and sets the starting value for balance.
	 * @param start
	 */
	AccountHolder(double start)
	{
		setBalance(start);
	}
	/**
	 * adds an amount to your balance
	 * @param balance
	 */
	public void deposit(double balance)
	{
		if(balance < 0)
		{
			System.out.println("\nYou can not desposit a negative number");
		}
		else if(balance >=0)
		{
		this.balance =+ balance;
		}
	}
	/**
	 * subtracts an amount form your balance
	 * @param balance
	 */
	public void withdrawal(double balance)
	{
		if(balance < 0)
		{
			System.out.println("\nYou can not withdraw a negative number");
		}
		else if(balance >=0)
		{
		this.balance =- balance;
		}
	}
	/**
	 * Override the toString method 
	 */
	public String toString()
	{
		return String.format("$%.2f", this.balance);
	}
	/**
	 *  changes the annual interest rate
	 * @param rate
	 */
	public static void modifyMonthlyInterest(double rate) 
	{
		annualInterestRate = rate;
	}
	/**
	 * adds a month's worth of interest to balance
	 */
	public void monthlyInterest()
	{
		this.balance += balance * (annualInterestRate / 12.0);	
	}
}
