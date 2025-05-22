import java.util.Scanner;
class checkcharacter1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter the character:");
		char data=sc.next().charAt(0);
		if (data>='A'&&data<='Z')
		{
			System.out.println("Uppercase");
		}
		else
		{
			if (data>='a'&&data<='z')
			
				System.out.println("Lowercase");
		else
			if (data>='0' && data<='9')
					
				System.out.println("Integer");
		else
				System.out.println("Specialcase");
					
			
		}
	}
}