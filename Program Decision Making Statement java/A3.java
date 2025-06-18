import java.util.Arrays;
import java.util.Scanner;
class A3
{
	static Scanner sc =new Scanner(System.in);
	public static void main (String[]args)
	{
		System.out.print("\t Enter the size of on Array : ");
		int size = sc.nextInt();
		int []a =new int [size];
		for (int i=0;i<a.length ;i++ )
		{
		System.out.print("\t Enter the element a["+i+"] : ");
        a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for (int i=a.length-1;i>=0 ;i-- )
		{
			System.out.print("["+a[i]+"]");
		}
	}
}