import java.util.Scanner;
class HappyOrUnhappyNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System.out.print("\t\t\tEnter the number:");
		int number=sc.nextInt();
			while (number !=1 && number !=4)
			{  
			  int sum=0;
			  while (number>0)
				{
				 int digit=(number%10)*(number%10);
			     sum=sum+digit;
				 number=number/10;
				}
			number=sum;
			}
			if (number==1)
			{
				System.out.println("Happy Number");
			}else
				
				if(number==4)
				System.out.println("Unhappy Number");
                			
	}
}
