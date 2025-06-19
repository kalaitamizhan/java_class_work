import java.util.*;
class linearSearch 
{    static Scanner sc=new Scanner(System.in);
	public static boolean linearSearch(int[]a,int element) 
	{
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==element)
		    return true;	
		}
		return false;
		
	}
	public static void main(String[]args)
	{
		int[]a={12,14,16,24,35,67};
		System.out.println(Arrays.toString(a));
		System.out.print("\t\t\tEnter the key element:");
		int element=sc.nextInt();
		if (linearSearch(a,element))
		{
			System.out.println("\npresent");
		} else
			System.out.println("\nNot present");

	}
}
