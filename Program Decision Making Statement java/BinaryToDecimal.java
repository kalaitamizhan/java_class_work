import java.util.Scanner;
class BinaryToDecimal
{   
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int ans=0,x=1;
		while (number>0)
		{
			ans+=(number%10)*x;
			x*=2;
			number/=10;
		}
		System.out.println(ans);
		
	}
}
