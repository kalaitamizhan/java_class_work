import java.util.Scanner;
class PosOrNegOrZero
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Start");
		System.out.print("\t\t\tEnter the number:");
		int number=sc.nextInt();
		if (number==0)
		{
		
		System.out.println(number+":is Zero");
		}
		else
			{
			if (number>0)
			System.out.println(number+":is +ve");
			
			else
			System.out.println(number+":is -ve");

				
			
		}
	}
}
