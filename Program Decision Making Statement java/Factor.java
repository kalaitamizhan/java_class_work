import java.util.Scanner;
class Factor 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{   System.out.println("Start");
		System.out.print("Enter the Number:");
		int number=sc.nextInt();
		for (int i=1;i<=number/2 ;i++ )
		{ if (number%i==0)
		System.out.println("Factor is :"+i);   	
		}
		
		
	}
}
