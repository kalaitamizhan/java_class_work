import java.util.Scanner;
class PrintNTo1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the n:");
		int n=sc.nextInt();
		int number=1;
		while (number<=n)
		{
			System.out.println(n);
		n--;
		}
		
	}
}