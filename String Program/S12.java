//input a :["Hi","How", "Are","You?","bey"]
//index:     0    1      2      3       5     
//output:["You?","Are","How","Hi"]


class S12 
{
	public static void solve(String str) 
	{
		String[]a=str.split(" ");
		//char[]a=str.toCharArray();
		
		for (int i=1;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[]args)
	{
		String s="Hi how are you? bey";
		System.out.println(s);
		solve(s);
	}
}
