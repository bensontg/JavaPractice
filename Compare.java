import java.util.Scanner;
 class Compare
{
	 
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your starting payment:");
    	int pay=sc.nextInt();
        System.out.println("Enter your ending paying amount:");
        int paing=sc.nextInt();
		int j=pay+paing;
     if(pay==paing)
	 {
	   System.out.println(j);	 
	 }	
	}
	 static void pattern()
	 {
		 for(int i=0;i<5;i++)
		 {
			 for(int j=5;j>i;j--)
			{
				 System.out.print(j);
			}
			 System.out.println();
		 }
	 }
	public static void main(String[] args)
	{
		Compare.add();
		Compare.pattern();
	}
}