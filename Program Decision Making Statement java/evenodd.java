import java.util.Scanner;
class evenodd
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.print("\t\t\tEnter the number:");
		int num=sc.nextInt();
		System.out.println("\t\t\tProcessing......");
		Thread.sleep(5000);
		if (num%2==0)
		{
			System.out.println(num+":is Even");
		}
		else{
			System.out.println(num+":is Odd");

		}
	}
}