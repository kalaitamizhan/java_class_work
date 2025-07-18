import java.util.*;
class MergeSortArray
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,4};
		int[]b={2,4,5,5};
		int[]res=merge(a,b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.print(Arrays.toString(res));
	}
	public static int[] merge(int[]a,int[]b)
	{
		int[]c = new int[a.length+b.length];
		int x=0,left=0,right=0;
		while (left<a.length && right<b.length)
		{
			if (a[left] < b[right])
			{
				c[x++] = a[left++];
			}
			else if (a[left] == b[right])
				c[x++] = a[left++];
			else if(b[right] < a[left])
				c[x++] = b[right++];
		}
		while (left<a.length)
		{
		     c[x++] = a[left++];	
		}
		while (right<b.length)
		{
			c[x++] = b[right++];
		}
		return c;
	}
}
