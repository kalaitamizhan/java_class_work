class p1
{
    public static void main(String[]args)
    {
        int n=9;
        for(int i=0;i<n;i++)
        {
            for(int j=0,k=5;j<n;j++,k--)
            {
                if(i>=j+n/2&&i+j>=n-1+n/2) 
                System.out.print(j+" ");
               else
               System.out.print("  ");
            }
               System.out.println();
        }
        
    }
}