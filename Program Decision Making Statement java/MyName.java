class MyName 
{
	public static void main(String[] args) throws Exception
	{
		int n=11;
			for (int i=0;i<n;i++)
			{
			for (int j=0;j<n;j++ )//Box1
			{
				if (j==0 || i==0 || i==n-1 || j==n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
				    Thread.sleep(20);
			}
				System.out.print("\t");
				for (int j=0;j<n;j++ )//Box2
			{
				if (i==0 ||j==0 ||i==n/2  || j==n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
				   Thread.sleep(20);
			}
				System.out.print("\t");
				for (int j=0;j<n;j++ )//Box3
			{
				if (i==j && i<=n/2 || i+j==n-1 && i<=n/2 || j==n/2 && i>=n/2 )
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
				    Thread.sleep(20);
			}
				System.out.print("\t");
				for (int j=0;j<n;j++ )//Box4
			{
				if (i==0 || j==0 || j==n-1 || i==n/2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
				    Thread.sleep(20);
			}
			System.out.println();
			}
	}
}
