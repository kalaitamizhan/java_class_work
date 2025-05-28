import java.util.Scanner;
class Hotels
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		boolean flag=true;
		do
		{
		    System.out.println("1.Buhari\n2.A2B\n3.exit");
		    System.out.print("\t\tEnter your Hotel:");
		    int Hotel=sc.nextInt();
			if (Hotel==3)
			{
				flag=false;
				System.out.println("\t\t\t\nThank you Dont repeat agin !");
			}
			else
			{
				switch (Hotel)
				{
				case 1:{System.out.println("\nWelcome to Buhari");
				        System.out.println("..................");
					break;}
				case 2:{System.out.println("\nWelcome to A2B");
					System.out.println("..................");
					break;}
				
				}
			}
			
			
		}
		while (flag);
		System.out.println("\t\t\t\nBey Bey");
	}
}