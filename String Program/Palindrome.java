import java.util.*;
class Palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{do
	{  boolean flag=true;
		System.out.print("\nEnter the Word:");
		String str=sc.nextLine();
		String res="";
		for (int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		if (str.equals(res))
		{
			System.out.println("This word is a palindrome");
		}
		else
			System.out.println("This word is not a palindrome");
	}
		while (true);

	}
}
