/*
intput:A1b2C3d4E5
output 1:ace
output 2:BD
output 3:15
*/
class S10
{
	public static void main(String[]args)
	{
		String str="A1b2C3d4E5";
		System.out.println("input:"+str);
		char[]a=str.toCharArray();
		String res1="";
        String res2="";
		int res3=0;
for (int i=0;i<a.length;i++)
{
	if (a[i]>='0'&&a[i]<='9')
	{
		res3+=a[i]-48;
	}
	else if (a[i]>='A'&& a[i]<='Z')
		res1+=(char)(a[i]+32);
	else if (a[i]>='a'&&a[i]<='z')
	     res2+=(char)(a[i]-32);
	
    }
	System.out.println("output:"+res1);
	System.out.println("output:"+res2);
	System.out.println("output:"+res3);

	}
}
