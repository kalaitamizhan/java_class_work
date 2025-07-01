/*
input:"Sy23e6d"
output:11
*/
/*
This program using "toCharArray()"
*/
class S7 
{
	public static int solve(String s) 
	{
		char[]a=s.toCharArray();
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>='0' &&a[i]<='9')
			{
			sum=sum+a[i]-48;
			}
		}
		return sum;
	}
	public static void main(String[]args)
	{
		String s="Sy23e6d10";
		System.out.println(s+"\n"+solve(s));
		
	}
}
/*
  Asscii value 
  -------------
     0=48
     1=49
	 2=50
	 3=51
	 4=52
	 5=53
	 6=54
	 7=55
	 8=56
	 9=57
*/