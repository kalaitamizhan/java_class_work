import java.util.Scanner;
class Universe
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.println("Find you universe name!");
		System.out.println(" 0 to 30---->Universe Name \n31 to 60 \n61 to 90 \n91 to 100");
		System.out.print("\t\t\tEnter the number:");
		int num=sc.nextInt();
		System.out.println("Processing.....");
		Thread.sleep(5000);
		if ( num>=0 && num<=30)
		{
			System.out.println("Mars is your Universe!!");
		}
		else{
			if (num>=31 && num<=60)
			System.out.println("Moon is your Universe !!");
			else
			if (num>=61 && num<=90)
			System.out.println("Jupiter is your Universe!!");
			else
			if (num>=91 && num<=100)
			System.out.println("Earth is your Universe!!");
			else
			System.out.println("Invalid Data");


			
		}
	}
}