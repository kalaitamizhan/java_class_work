import java.util.Scanner;
class posOrneg
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("start");
		System.out.println("\t\t\tEnter the number:");
		int number=sc.nextInt();
		String res=(number>0)?"positive":"negative";
		System.out.println(number+":is"+res);
		System.out.println("end");
		
	}
}
