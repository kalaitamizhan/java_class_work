import java.util.Scanner;
class StudentGrade
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
	System.out.println("\n\t!Find your grade!");
	System.out.print("\t\t\tEnter your percentage:");
	int per=sc.nextInt();

		if(per>=90 && per<=100)
		{
		System.out.println(per+": A Grade");
		}
		else{
			if(per>=70 && per<=89)
		System.out.println(per+": B Grade");
		else
		    if(per>=35 && per<=69)
		System.out.println(per+": C Grade");
		else
		     if(per<35 && per<=1)
		System.out.println(per+": Fail");
		
		
		}
	}
}
