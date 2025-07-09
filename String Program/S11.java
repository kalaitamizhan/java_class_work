/*
intput:hi@how#you
output:uo@ywo#hih
*/
class S11  
{
	public static String solve(String str) 
	{
		//str=str.toLowerCase();
		char[]a=str.toCharArray();
		int l=0,r=a.length-1;
		char temp=' ';
		//str=['H','i','@','h','o','w','#','y','o','U']
		while (l<r)
		{    
			if (a[l]>='a'&& a[l]<='z'&& a[r]>='a'&&a[r]<='z')
			{
				temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			else if (a[l]!='a'&&a[l]!='z')
			{
			  l++;
			}	
			 else if ( a[r]!='a'&& a[r]!='z')
			{	
			 r--;
			}
			
		}
		return new String(a);
	}
		public static void main(String[]args)
		{
			String str="hi@how#you";
			System.out.println("\n"+str);
			System.out.print(ja"\n"+solve(str));
			
		}
		
}
