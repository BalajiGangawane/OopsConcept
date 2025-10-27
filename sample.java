package OOpsconcept;	

import java.util.Scanner;

class employeee
{
	int empid;
	String empname;
	float sal;
	employeee()
	{
	System.out.println("this is employee constructor: ");
	}
	
	void getdata()
	{
		System.out.println("we have employees data: " );
		System.out.println(" this is employee id: " + empid);
		System.out.println(" this is employee name :" + empname);
		System.out.println(" this is employee salary : " + sal);
	}
	
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		this.empid=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter employee name");
		this.empname=sc1.nextLine();
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter emp;oyee salary");
		this.sal=sc2.nextFloat();
		
	}
}
class manager extends employeee
{
	int manid;
	String manname;
	float sal;
	manager()
	{
		System.out.println("this is manager constructor: ");
	}
	
	void getdata()
	{
		System.out.println("this is manager id : " + manid);
		System.out.println("this is manager name: " + manname);
		System.out.println("this is manager salary: " + sal);
		
	}
	void showdata()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println(" enter the salary of manager id: " );
		this.sal=sc3.nextInt();
		Scanner sc4=new Scanner(System.in);
		System.out.println(" enter the salary of manager name: " );
		this.manname=sc4.nextLine();
		Scanner sc5=new Scanner(System.in);
		System.out.println(" enter the salary of manager: " );
		this.sal=sc5.nextFloat();
	}
	
	
}
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
employeee e=new employeee();
e.setdata();
e.getdata();
manager m=new manager();
m.showdata();
m.getdata();
	}

}

