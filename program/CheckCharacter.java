
import java.util.Scanner;
class CheckCharacter
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter the Character:");
		char data=sc.next().charAt(0);
		String res=(data >='A'&& data<='Z')?"Uppercase":(data>='a' && data<='z')?"Lowercase":(data>='0' && data<='9')?"Integer":"Specialcase";
				System.out.print(data+" is: "+res);


	}
}