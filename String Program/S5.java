 /*
    method           returnType     purpose     
-------------------  -----------   ---------
Vname.toCharArray()	  char[]   convert String to 
                                    Character Array		  		  
 */
class S5
{
	public static void main(String[] args) 
	{
		String str="java";
		char[]a=str.toCharArray();//a['j','a','v','a']
		for (int i=0;i<a.length;i++ )
		{
			System.out.print(a[i]);
		}
		System.out.print("\n"+a[0]);//a['j']
		System.out.print(a[1]);//a['a']
		System.out.print(a[2]);//a['v']
		System.out.print(a[3]);//a['a']

	}
}
