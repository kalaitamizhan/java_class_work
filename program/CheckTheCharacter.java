import java.util.Scanner;
class CheckTheCharacter
{
	static Scanner dd=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("\t\t\t Enter The Character:");
		char ch=dd.next().charAt(0);
		String res=(Character.isUpperCase(ch))?"UpperCase":(Character.isLowerCase(ch))?"LowerCase":(Character.isDigit(ch))?"Integer":"SpecialCase";
		System.out.println(ch +" value is "+res);
		
		
	}
}