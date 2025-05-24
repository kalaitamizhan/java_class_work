import java.util.Scanner;
class FoodAndSkill
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.println("\n1.Food\n2.Skill");
		System.out.print("\t\t\tEnter the number:");
		int data=sc.nextInt();
		System.out.println("processing....");
		Thread.sleep(3000);
		switch(data)
		{
			default:System.out.println("Invalid");
			break;
			case 1:System.out.println("\n1.Itli\n2.Dhosa");
		    System.out.print("\t\t\tEnter the number:");
		    int data1=sc.nextInt();
			System.out.println("processing....");
		    Thread.sleep(3000);
		switch(data1)
			{
				case 1:System.out.println("\nItly price is 50 Rupees");
				break;
				case 2:System.out.println("\nDhosa price is 50 Rupees");
				break;
				default:System.out.println("Invalid");
			}
			break;
			case 2:System.out.println("\n1.Java\n2.Sql");
		    System.out.print("\t\t\tEnter the number:");
		    int data2=sc.nextInt();
			System.out.println("processing....");
		    Thread.sleep(3000);
		switch(data2)
			{
				case 1:System.out.println("\nTaberiz is your trainer");
				break;
				case 2:System.out.println("\nNagaraj is your trainer");
				break;
				default:System.out.println("Invalid");

			}
			
			
		}	
	}
}
