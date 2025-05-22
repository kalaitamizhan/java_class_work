import java.util.Scanner;
class LargestNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter the A :");
		int a=sc.nextInt();
		System.out.print("\t\t\tEnter the B :");
		int b=sc.nextInt();
		System.out.print("\t\t\tEnter the C :");
		int c=sc.nextInt();
		
		if (a>b && a>c)
		{
		  System.out.println("A is Grater");
		}
		else{
			if (b>a && b>c)
			
		  System.out.println("B is Grater");
			else
		  System.out.println("C is Grater");
		}
		
	}
}
