import java.util.*;
class CalculatorM
{
	public static double add(double a,double b) 
	{ 
	 return a+b;
	}
	public static double sub(double a,double b) 
	{
	  return a-b;
	  
	}
	public static double mult(double a,double b) 
	{
	 	
	 return a*b;
	}
	public static double div(double a,double b) 
	{
	
	 return a/b;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		boolean flag=true;
		do
		{
		System.out.println("\n\t\t\tCalculator");
		System.out.println("\t\t\t------------");
		System.out.println("\t\t\t1.Addition(+)\n\t\t\t2.Subraction(-)\n\t\t\t3.multiplicaion(*)\n\t\t\t4.Divition(/)\n\t\t\t5.Exit");
		System.out.print("\n\t\t\tChoose the above option:");
		int data =sc.nextInt();		
		if (data!=5)
			{
			System.out.print("Enter the a:");
		    int a =sc.nextInt();
		    System.out.print("Enter the b:");
		    int b =sc.nextInt();
			switch (data)
			{
			case 1:System.out.println("Answer is:"+add(a,b));
			break;
			case 2:System.out.println("Answer is:"+sub(a,b));
			break;
			case 3:System.out.println("Answer is:"+mult(a,b));
			break;
			case 4:System.out.println("Answer is:"+div(a,b));
			break;
		}
			}
		else 
			System.out.println("exiting the calculator....");
		}
		while (false);
		System.out.println("Thank You");
	}
}
