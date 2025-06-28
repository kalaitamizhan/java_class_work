import java.util.*;
class FactorialAndFactor
{   static Scanner sc=new Scanner(System.in);
	public static long factorial(long n) 
	{
		long sum=1;
		for (int i=1;i<=n;i++)
		{			
			sum*=i;
		}
		return sum;
	}
	public static void factor()
	{
		System.out.println("\n\n\t\tTo Finding The Factor");
		System.out.println("\t\t......................");
		System.out.print("\t\tEnter the number:");
		int number=sc.nextInt();
		for (int i=1;i<=number/2;i++)
		{
			if(number==0)
			{
				System.out.println("Zero(0) itself is not typically considered a factor ");
			}
			else if (number%i==0)
			System.out.println("\n\t\t(\"The given number of factor is:\""+i+"\")");	
		}
		
			
	}
	public static void main(String[]args)throws Exception
	{ boolean flag=true;
		do{
		System.out.println("\n\t\tTo Finding The Factorial");
		System.out.println("\t\t.........................");
		System.out.print("\t\tEnter the number:");
		long n=sc.nextInt();
		System.out.println("Processing.....");
		Thread.sleep(4000);
		long res=factorial(n);
		System.out.println("\t\t(\"The given number of factorial is:"+res+"\")");
		factor();
		}while(flag=true);
		
	}
}
