import java.util.Scanner;
class Calc
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		boolean flag=true;
		do
		{
		
			System.out.println("Select Operator");
			System.out.println(".................");
			System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.exit");
			System.out.print("Select your Choice:");
			int choice=sc.nextInt();
			if (choice==4)
			{ flag=false;
			}
			else{
				System.out.print("Enter A:");
				int a=sc.nextInt();
				System.out.print("Enter B:");
				int b=sc.nextInt();
				
				switch (choice)
				{
				case 1:{System.out.println("The Output is:"+ (a+b));
					break;}
				case 2:{System.out.println("The Output is:"+ (a-b));
					break;}
				case 3:{System.out.println("The Output is:"+ (a*b));
					break;}
				
				}
			}
			
		}
		while (flag);
		System.out.println("Thank you...");
	}
}