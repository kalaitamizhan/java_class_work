import java.util.*;
class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[]a={25,16,17,8,12,14,2};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length-1;i++ )
		{
			int s=i;
			for (int j=i;j<a.length;j++ )
			{
				if (a[j]<a[s])
				{
					s=j;
					
				}
			}
			int temp=a[i];//int temp=a;
			a[i]=a[s];    //a=b;
			a[s]=temp;    //b=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
