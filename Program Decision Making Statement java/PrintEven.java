import java.util.Scanner;
class PrintEven
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		System.out.print("Enter the Starting number:");
		int start=sc.nextInt();
		System.out.print("Enter the end number:");
		int end=sc.nextInt();
		for (int i=start; i>=end ; i--)
		{
			if (i%2==0)
			{
				System.out.println(i+"");
			}
			
		}

	}
}
