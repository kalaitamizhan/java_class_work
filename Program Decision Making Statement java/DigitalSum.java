import java.util.Scanner;
class DigitalSum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		System.out.print("Enter the Number:");
		int number=sc.nextInt();
		int sum=0;
		while (number>0)
		{
			sum=sum+number%10;
			number=number/10;
			
		}
		
		System.out.println("Digital Sum:"+sum);
	}
}
