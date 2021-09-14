public  class Shop
{
	static String owner="benson";
	String brand;
	int price;
	int discount;
		public Shop(String brand,int price,int discount)
	{
		this.brand=brand;
		this.price=price;
		this.discount=discount;
	}
	public Shop(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public Shop()
	{
		System.out.println("hi");
	}
	public static void main(String[] args)
	{
		Shop prod1=new Shop("ABC",10);
		Shop prod2=new Shop("PQR",20);
		Shop prod3=new Shop("ABC",10,4);
		Shop printer=new Shop();
	}
}