import java.util.Scanner;
class VowelOrConso
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
	System.out.println("Start The Program!!");
	System.out.print("\t\t\tEnter the letter:");
	char data=sc.next().charAt(0);
	System.out.println("Pocessing...");
	Thread.sleep(3000);
	switch(data)
	{
		case'A','E','I','O','U':
		case'a','e','i','o','u':System.out.println(data+":is Vowel");
		break;
		default:System.out.println("Invalid");

	}
	
	}	
}
