import java.util.Scanner;
class Perfect
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int sum=0;
		for (int i=1;i<=number/2 ;i++ )
		{
			if (number%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==number)
		{
			System.out.println("Perfect");
		}
		else
			System.out.println("notPerfect");
			
	}
}
	