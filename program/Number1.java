import java.util.Scanner;
class Number1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		System.out.print("Enter c:");
		int c = sc.nextInt();
		String res1 = (a==0)?"Zero":(a>0?"Positive":"Negative");
		String res2 = (b==0)?"Zero":(b>0?"Positive":"Negative");
		String res3 = (c==0)?"Zero":(c>0?"Positive":"Negative");
		System.out.println(a+": is "+res1);
		System.out.println(b+": is "+res2);
		System.out.println(c+": is "+res3);	
	}
}
