import java.util.Scanner;
class StrongNumberOrNot
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Start");
		System.out.print("\t\t\tEnter the number:");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while (number>0)
		{
			int last=number%10;
			int ans=1;
			for (int i=2;i<=last ;i++ )
			{
				ans*=i;
			}
			sum+=ans;
			number/=10;
		}
		String res=(temp==sum)?"Strong":"not Strong";
		System.out.println(res);
	}
}