import java.util.Scanner;
class StudentGrade
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the percentage:");
		int per= sc.nextInt();
		String res = (per>100 || per<=0)?"Invalid":(per>=90)?"A":(per>=60)?"B":(per>=35)?"C":"Fail";
		System.out.println(per+" Grade is: "+res);
	}
}