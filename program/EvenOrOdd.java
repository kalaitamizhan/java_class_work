import java.util.Scanner;
class EvenOrOdd
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");:
		System.out.print("\t\t\tEnter the n:");
		int n=sc.nextInt();
		int number=1;
		while(number<=n)
		if (number%2==0)
		{
			System.out.println(number+":is Even");
			number++;
			
		}
		else
		{                            
			System.out.println(number+":is Odd");
			number++;
