import java.util.Scanner;
class FizzBuzz
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		System.out.print("Enter the Starting number:");
		int start=sc.nextInt();
		System.out.print("Enter the Ending number:");
		int end=sc.nextInt();
		for (int i=start;i<=end ; i++)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println(i+" :FizzBuzz");
			}
			else
				if (i%3==0)
				{
				System.out.println(i+" :Fizz");
				}
			else 
				if (i%5==0)
				{
				System.out.println(i+" :Buzz");
				}
		}

	}
}
