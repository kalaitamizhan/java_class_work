import java.util.*;
class SubArrayElement2 
{
	public static void solve(int[]a) 
	{
		int maximum=Integer.MIN_VALUE;
		int minimum=Integer.MAX_VALUE;
			for (int i=0;i<a.length ;i++ )
			{
			int sum=0;
			for (int j=0;j<a.length ;j++ )
			{
				sum+=a[i];
				maximum=Math.max(sum,maximum);
				minimum=Math.min(sum,minimum);
			}
			}
		System.out.println("Maximum SubArray:"+maximum);
		System.out.println("Minimum SubArray:"+minimum);
        
	}
	public static void main(String[]args)
	{
		int[]a={2,4,3,6,1};
		System.out.println(Arrays.toString(a));
		solve(a);
		
	}
}
