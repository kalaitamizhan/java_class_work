import java.util.Scanner;
class Weeks
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{	
	    System.out.println("Start the program");
	    System.out.print("\t\t\tEnter the Number:");
		int num = sc.nextInt();
		System.out.println("Processing......");
		Thread.sleep(10000);
		switch(num)
	{
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		default:System.out.println("Invalid");
	}	

	}
		
		
}