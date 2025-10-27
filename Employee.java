package OOpsconcept;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Emp_id;
		String Emp_name;
		Double Salary;
		String Designation;
		Scanner sc=new Scanner(System.in);
		System.out.println(" eneter employee id : ");
		int a=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println(" eneter employee Name:  ");
		String b=sc1.nextLine();
		Scanner sc2=new Scanner(System.in);
		System.out.println(" enetr employee salary:  ");
		String c=sc2.nextLine();
		System.out.println(" Student details : ");
		System.out.println(" EMI_ID =" +a);
		System.out.println(" EMP-NAME =" +b);
		System.out.println(" EMP_ SALARY ="  +c);

		Scanner sc0=new Scanner(System.in);
		System.out.println("enter valid number : ");
		int i=sc0.nextInt();
		switch(i)
		{
		case 0:
			System.out.println(" Employee id = " + a);
			break;
		case 1:
			System.out.println(" Employee Name = " + b);
			break;
		case 2:
			System.out.println(" Employee Salary = "  + c);
			break;
			default:
				System.out.println(" invalid number" );
				break;
		
		
		}
		
	
		
		
		{
			
		}

	}

}
