public class India
{
static String capital="New delhi";
String citizenName;
int age;
double height;
boolean nri;
String fatherName;

public static void main(String[] args)
{
India citizen=new India();
citizen.citizenName="Ben";
System.out.println(citizen.fatherName);
System.out.println(citizen.age);
System.out.println(citizen.height);
System.out.println(citizen.nri);
System.out.println(citizen.capital);
System.out.println(citizen.citizenName);
	India citizen2=new India();
	citizen2.citizenName="ram";
	citizen2.fatherName="pqrs";
	citizen2.age=65;
	citizen2.height=5.3;
	citizen2.nri=true;
System.out.println(citizen2.fatherName);
System.out.println(citizen2.age);
System.out.println(citizen2.height);
System.out.println(citizen2.nri);
System.out.println(citizen2.capital);
System.out.println(citizen2.citizenName);
citizen.applyPancard();
	public void applyPancard();
	{
		
	}

}
}