class Mda4  
{
	
	public static void main(String[] args) 
	{
		int[][]a={
			{10,20,30},
			{40,50,60},
			{70,80,90},
		};
			for (int i=0;i<a.length;i++)
			{
				for (int j=a[i].length-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		
	}
}
