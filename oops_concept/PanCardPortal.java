import java.util.*;
class PanCardPortal 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		PanCard card1=new PanCard("suresh","sur2210pi",17,12345);
		PanCard card2=new PanCard("ramesh","ram2210ci",24,6789);
		PanCard card3=new PanCard("sathish","sath22hi",25,123);
		
		PanCard []cards={card1,card2,card3};
		
		boolean home=true;
		do
		{
			System.out.println("\t\t\t  welcome to Pancard portal");
			System.out.println("\t\t\tAn Initiative of Gov of India");
			System.out.println("\t\t\t==============================");
			System.out.println("\t\t\t1.get info\n\t\t\t2.set info\n\t\t\t3.exit");
			System.out.print("\t\t\tEnter the choice:");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:{
				System.out.println("\n\t\t\tGet user page");
			boolean userPage=true;
			do
			{
				int user_choice=getUsers(cards);
				user_choice=user_choice-1;
				if (user_choice==3)
				{
					userPage=false;
					
				}else if (user_choice>=0 && user_choice<=2)
				{
					getUserInfo(cards[user_choice]);
				}			
			}
			while (userPage);
			}break;
			
			case 2:{
				System.out.println("\n\t\t\tSet user page");
				boolean userPage=true;
				do
				{
					int user_choice=getUsers(cards);
					user_choice-=1;
					if (user_choice==3)
					{
						userPage=false;
					}else if (user_choice>=0 && user_choice<=2)
					{
						setUserInfo(cards[user_choice]);
					}
				}
				while (userPage);
				}break;
				case 3:{
					home=false;
				}break;
			}
		}
		while(home);
	}
	public static int getUsers(PanCard[] cards)
	{
		for (int i=0;i<cards.length;i++ )
		{
			System.out.println("\t\t\t"+(i+1)+"."+cards[i].getName());
		}
		System.out.println("\t\t\t"+(cards.length+1)+".Exit");
		System.out.print("\t\t\tEnter the choice:");
		int user_choice=sc.nextInt();
		return user_choice;
	}
	public static void getUserInfo(PanCard card)
	{
		boolean flag=true;
		do
		{
			System.out.println("\n\t\t\tGet User Info");
			System.out.println("\t\t\t==============");
			System.out.println("\t\t\t1.Name");
			System.out.println("\t\t\t2.Pan_no");
			System.out.println("\t\t\t3.Age");
			System.out.println("\t\t\t4.Contact");
			System.out.println("\t\t\t5.Exit");
			System.out.print("Enter your choice:");
			int user_choice=sc.nextInt();
			switch (user_choice)
			{
			case 1:{
				System.out.println("\t\t\t"+card.getName());
			}break;
			case 2:{
				System.out.println("\t\t\t"+card.getPan_no());
			}break;
			case 3:{
				System.out.println("\t\t\t"+card.getAge());
			}break;
			case 4:{
				System.out.println("\t\t\t"+card.getContact());
			}break;
			case 5:{
				flag=false;
			}break;
			
			}
		}
		while (flag);
	}
	public static void setUserInfo(PanCard card)
	{
		boolean flag=true;
		do
		{
			System.out.println("Set User Info");
			System.out.println("==============");
			System.out.println("\t\t\t1.Name");
			System.out.println("\t\t\t2.Age");
			System.out.println("\t\t\t3.Contact");
			System.out.println("\t\t\t4.Exit");
			System.out.print("\t\t\t1Enter the choice:");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:{System.out.print("\t\t\tEnter the Name:");
			String name=sc.next();
			card.setName(name);
			}break;
				case 2:{System.out.print("\t\t\tEnter the Age:");
			int age=sc.nextInt();
			card.setAge(age);
			}break;
				case 3:{System.out.print("\t\t\tEnter the Contact:");
			long contact=sc.nextLong();
			card.setContact(contact);
			}break;
				case 4:{
					flag=false;
			}
					break;
			}
		}
		while (flag);
		
	}
        }
