import java.util.*;
class Palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\nEnter the Word:");
		String str=sc.nextLine();
		String res="";
		for (int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(str.equals(res)?"Palindrome":"Not Palindrome");
	
	}
}
