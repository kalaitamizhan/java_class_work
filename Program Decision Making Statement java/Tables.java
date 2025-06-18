import java.util.Scanner;
class Tables
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.println("Start");
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		for (int i=1;i<=10 ;i++ )
		{
			int res=n*i;
			System.out.println(n+"*"+ i +"=" + res);
			Thread.sleep(200);
		}
		System.out.print("Ends");
		
	}
}