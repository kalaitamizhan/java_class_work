
class Mda3
{
	public static void main(String[]args) 
	{
	int[][]a={
		{10,20,30},
		{40,50,60},
		{70,80,90},
	};
	int sum=AddArrayElement(a);
	System.out.println("\nSum of element:"+sum);	
 }
 public static int AddArrayElement(int[][]a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
				
			}
				System.out.println();
		}
		return sum;
	}
}