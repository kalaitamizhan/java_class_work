/*
input:Da23y6A
output:11
*/
/*
This program using "charAt()"
*/
class s9
{
	public static int solve(String s) 
	{
		int sum=0;
		for (int i=0;i<s.length();i++)
		{
			char a =s.charAt(i);
			System.out.print(a);
			if (a>='0'&& a<='9')
			{
				sum=sum+a-48;
			}
		}
		return sum;
	}
	public static void main(String[]args)
	{
		String s="Da23y6A01";
		System.out.println("\n"+s+"\nResult:"+solve(s));
	}
}
