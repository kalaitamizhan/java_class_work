import java.util.Scanner;
class Ptint1ToN
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
	System.out.println("Starts");
	System.out.print("Enter the n:");
	int n=sc.nextInt();
	for (int i=1;i<n ;i++ )
	{
		System.out.println("output is:"+i);
	}
	}
}