public class Bank
{
	public static void main(String[] args)
	{
		Bank cashier=new Bank();
		cashier.deposit(500);
		cashier.deposit("muthu");
		cashier.deposit("500.5");
		cashier.deposit(true);
	}
void deposit(int box)
	{
		System.out.println("depositing");
	}
	void deposit(String box)
	{
		System.out.println("depositing");
	}
	void deposit(double box)  
	{
		System.out.println("depositing");
	}
void deposit(boolean box)
	{
		System.out.println("depositing");
	}
}
