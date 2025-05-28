import java.util.Scanner;
class Counts
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int count=0;
		while (number>0)
		{   
			number=number/10;
			count++;
		}
			System.out.println("Count is:"count);
	}
}