class School2
{
	String name;
	int mark1,mark2,mark3,mark4,mark5,mark6,lab1,lab2,lab3,depID;
	public School2(String name,int mark1,int mark2,int mark3,int lab1,int lab2,int lab3,int depID)
	{
		if(depID==111)
		{
	 this.name=name;
     this.mark1=mark1;
	 this.mark2=mark2;
	 this.mark3=mark3;
	 this.lab1=lab1;
	 this.lab2=lab2;
	 this.lab3=lab3;
		}
	}
	public School2(String name,int mark1,int mark2,int mark3,int mark4,int lab1,int lab2,int depID)
	{
		if(depID==222)
		{
	 this.name=name;
     this.mark1=mark1;
	 this.mark2=mark2;
	 this.mark3=mark3;
	 this.mark4=mark4;
	 this.lab1=lab1;
	 this.lab2=lab2;
	}
	}
	public School2(String name,int mark1,int mark2,int mark3,int mark4,int mark5,int lab1,int depID)
	{
		if(depID==333)
		{
	 this.name=name;
     this.mark1=mark1;
	 this.mark2=mark2;
	 this.mark3=mark3;
	 this.mark4=mark4;
	 this.mark5=mark5;
	 this.lab1=lab1;
		}
	}
	public School2(String name,int mark1,int mark2,int mark3,int mark4,int mark5,int mark6,int depID)
	{
		if(depID==444)
		{
	 this.name=name;
     this.mark1=mark1;
	 this.mark2=mark2;
	 this.mark3=mark3;
	 this.mark4=mark4;
	 this.mark5=mark5;
	 this.mark6=mark6;
		}
	}
	public static void main(String[] args)
	{
	School2 csestudent=new School2("ben",55,64,89,94,98,92);
	School2 biostudent=new School2("ben",45,67,45,78,68,87);
	School2 accstudent=new School2("ben",56,45,78,89,98,65);
	School2 histudent=new School2("ben",76,87,65,45,53,45);
		}
}
					   