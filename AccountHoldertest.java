import java.util.Scanner;

public class AccountHoldertest {

	public static void main(String[] args) {
		
		int menu = 0; // holder variable to check to see what menu option is typed
		
		Scanner scan = new Scanner(System.in); // creating scanner object
		
		System.out.print("Hello please enter starting balance\n");
		
	    double start = scan.nextDouble(); //starting balance
		
	    AccountHolder Account = new AccountHolder(start);
		
		
		while(true)
		{
			System.out.println("\n(1) Balance\n(2) Withdraw\n(3) Deposit\n(4) Monthly Interest rate\n(5) Change Interest Rate\n(6) Exit\n");
			menu = scan.nextInt();
			switch(menu) // menu
			{
			case 1: System.out.println("\n"+Account.toString()); //Balance
				break;
			case 2: System.out.println("How much would you like to withdraw");
			    double with = scan.nextDouble();
				Account.withdrawal(with); //Withdraw
				break;
			case 3: System.out.println("How much would you like to deposit");
		        double depo = scan.nextDouble();
				Account.deposit(depo); //Deposit
				break;
			case 4: System.out.println("Mothly Balances for a year with interest rate of: "+AccountHolder.annualInterestRate+
					"\nBalances:\nBase: "+Account.toString());
			      double temp = Account.getBalance(); // stores the balance at the start
				  for(int i = 0; i < 13; i++) // this loop shows the balance of the account after a year of collecting interest
				  {
					  Account.monthlyInterest(); // adds Monthly Interest rate
					  System.out.println("Month "+i+": "+Account.toString());
				  }
				  Account.setBalance(temp); // sets balance back to balance to base
				break;
			case 5:System.out.println("What is the new interest rate?");
	            double rate = scan.nextDouble();
				if(rate < 0 || rate > 1)
				{
					System.out.println("\nInterest rate can only range from 0.0 to 1.0");
					break;
				}
	            AccountHolder.modifyMonthlyInterest(rate); // change Interest rate
				break;
			case 6: scan.close();
				System.exit(0); //Exit function
			}
			
		}
	}

}
