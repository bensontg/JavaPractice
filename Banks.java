public class Banks
{
	static int bankbalance=100000;
	static int balance=500;
	public static void main(String[] args)
	{
		Banks customer=new Banks();
			customer.deposit(1000);
		System.out.println(Banks.bankbalance);
		System.out.println(customer.balance);
		System.out.println(Banks.balance);
		System.out.println(balance);
	}
	void deposit(int deposit)
	{
		//System.out.println("Customer deposit"+deposit);
	}
}