public class Office
{
	int formfee=10;
	public static void main(String[] args)
{
	Office he=new Office();
	he.doService();
	System.out.println(he.formfee);
	he.going();	
		
}
   public void doService()
	{
		System.out.println("Providing service");
	}
	private void going()
	{
		System.out.println("Hi");
	}
		
}