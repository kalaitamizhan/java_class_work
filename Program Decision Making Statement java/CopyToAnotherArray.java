import java.util.Arrays;
class CopyToAnotherArray
{
	public static int[] copy(int[]x) 
	{
		int[]a = new int[x.length];
		for (int i=0;i<a.length;i++ )
		{
			a[i]=x[i];
		}
		return a;
	}
	
	public static void main(String[]args)
	{
		int[]x={2,4,6,8};
		int[]res=copy(x);
		System.out.println("a:"+Arrays.toString(x));
		System.out.println("res:"+Arrays.toString(res));

	}
}
