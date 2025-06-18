import java.util.Arrays;
class EvenElemetsSum 
{
	public static int evenElemtSum(int[] a) 
	{
		int sum = 0;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]%2==0)
			{
				sum = sum + a[i];
			}
		}
		return sum;
	}
	public static void main(String[]args)
	{
		int[]a = {5,2,4,3,5,7,24};
		System.out.println("a: "+ Arrays.toString(a));
		int res = evenElemtSum(a);
		System.out.println("Event Elemnt Sum: "+res);
	}
}
