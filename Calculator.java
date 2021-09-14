public class Calculator
{
	static int num,no,res;
	
	
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		//cal.add(5,55);
		res=Calculator.add(5,150);
		Calculator.multiple(res);
		System.out.println(res);
	}
	public void multiple(Calculator res)
	{
		System.out.println(res*10);
	}
	int add(int num,int no)
	{	
	System.out.println(num+no);
	num=20;
	no=40;
	return num+no;
		
	}
}