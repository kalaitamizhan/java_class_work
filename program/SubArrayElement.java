import java.util.*;
class SubArrayElement
{
	public static void solve(int[]a) 
	{
		for (int i=0;i<a.length;i++ )
		{
			for (int j=0;j<a.length;j++ )
			{
				for (int k=i;k<=j ;k++ )
				{ 
					
					System.out.print(a[k]+" ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public static void  main(String[]args)
	{
		int[]a={2,6,4,8};
		System.out.println(Arrays.toString(a));
		solve(a);
	}
}
