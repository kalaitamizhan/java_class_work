import java.util.Scanner;
class MySelfe
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Starts");
		boolean flag=true;
		do
		{	
        System.out.println("Details");
		System.out.println(".......");
		System.out.println("1.My Selfe\n2.Favorit Game\n3.Exit");
		System.out.print("Select The Choice:");
		int choice=sc.nextInt();
		if(choice==3)
			{
				flag=false;
				System.out.println(" Dont Repeat Again!");
			}else
		switch (choice)
		{
		case 1:{
		    System.out.println("My Selfe");
		    System.out.println(".........");
		    System.out.println("1.Name\n2.DoB\n3.Exit");
		    System.out.print("Select The Choice:");
		    int choice2=sc.nextInt();
			if (choice2==3)
			{
				flag=false;
			}else
				switch (choice2)
				{
				case 1:{System.out.println("Dayanithi");
				break;}
				case 2:{System.out.println("DD/MM/YYYY");
					break;}
				}
			break;}
		}
		}
		while (flag);
		System.out.println("Thank You..");		
	}
}