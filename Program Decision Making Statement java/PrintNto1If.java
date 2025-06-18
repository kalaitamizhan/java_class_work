import java.util.Scanner;
class PrintNTo1If
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		System.out.print("Enter the n:");
		int n=sc.nextInt();
		for (int i=n; i>=1 ; i--)
		{
			System.out.print(i+"");
		}

	}
}