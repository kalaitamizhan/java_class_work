import java.util.Scanner;
class Reverse
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int n=0;
		while (0<=number)
		{
			n=number%10;
			number=number/10;
		
		}
			System.out.println(n);
		
	}
}