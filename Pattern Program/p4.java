class p4
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (i<=j-n/2 || i>=j+n/2 || i+j<=n-1-n/2 || i+j>=n-1+n/2)
				System.out.print("  ");
				else
				System.out.print("* ");	
			}
		System.out.print("\t");
		
		for (int j=0;j<n;j++)
			{
				if (i<=j-n/2 || i>=j+n/2 ||i+j<=n-1-n/2 ||i+j>=n-1+n/2|| i==n/2 && j==n/2)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
		System.out.print("\t");
		for (int j=0;j<n;j++)
			{
				if (i>=j)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
		System.out.print("\t");
		for (int j=0;j<n;j++)
			{
				if (i<=j)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
		System.out.println();
		}
	}
}
