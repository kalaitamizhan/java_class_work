import java.util.Scanner;
class Palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int rev=0;
		int temp=number;
		while (number>0)
		{
			rev=(rev*10)+(number%10);
			number=number/10;
		}
		System.out.println("Reverse Oreder:"+rev);
		System.out.println((temp==rev)?"\nyes":"\nno");
	}
}
