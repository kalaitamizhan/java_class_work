import java.util.*;
 class Swap_Without_Using_Temp_Variable 
{
	public static void solve(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
	    System.out.println("\t\t\tAfter Swap");
	    System.out.println("\t\t\t...........");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		return ;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the a value:");
		int a= sc.nextInt();
		System.out.print("Enter the b value:");
		int b= sc.nextInt();
		System.out.println("\t\t\tBefore Swap");
	    System.out.println("\t\t\t...........");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		solve(a,b);
	}
}
