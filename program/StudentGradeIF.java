import java.util.Scanner;
class StudentGradeIF
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter the Percentage:");
		int per=sc.nextInt();
		
		if(per>100 || per<=0 )
		{
			System.out.println("Invaled");
		}
		else
			{
			if(per>=90)
				
			System.out.println("A");
			
			else
				if (per>=60)
				
			System.out.println("B");
				
			else
				if (per>=35)
					
			System.out.println("C");

			else
			System.out.println("Fail");

				}

	}
}