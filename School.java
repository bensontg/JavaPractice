public class School
{
	String name;
	int rollNo;
	public School(String name,int rollNo)
	{
		//System.out.println("hi");
			this.name=name;
	       this.rollNo=rollNo;
	}
	
	public static void main(String [] args)
	{
		School student =new School("ben",123);
		School student1 =new School("raj",124);
		student.name="ben";
		student.rollNo=123;
		student1.study();
		student1.play();
	}
	public void study()
	{
		System.out.println("Study");
		System.out.println(name);
		System.out.println(rollNo);
		
	}
	public void play()
	{
		System.out.println("Study");
		System.out.println(name);
		System.out.println(rollNo);
		
	}
}