 /*
    method           returnType     purpose     
----------------     -----------   ---------
Vname.charAt()	       char         comvert the String 
                                    into char	  
 */
class S3 
{
	public static void main(String[] args) 
	{
		String s1=new String("java");
		StringBuffer s2=new StringBuffer("sql");
		StringBuilder s3=new StringBuilder("Python");
		String s4="C#";
		char a=s1.charAt(2);
		System.out.println("java   2 index is:"+a);
		System.out.println("sql    0 index is:"+s2.charAt(0));
		System.out.println("python 3 index is:"+s3.charAt(3));
		System.out.println("C#     1 index is:"+s4.charAt(1));
	}
}
