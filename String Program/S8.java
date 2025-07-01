/*
Method           returnType      Purpose
toUpperCase()    String        convert String into UpperCase
toLowerCase()     String        convert String into LowerCase
*/
/*
input:SpiDERmaN,SuPERmaN
output:SPIDERMAN,superman
*/
class S8
{
	public static String UpperLower(String s1,String s2 )
	{
		String res1=s1.toUpperCase();
	    String res2=s2.toLowerCase();
		System.out.println(s1+"--->"+res1);
		return res2;
	}	
	public static void main(String[]args)
	{
		String s1="SpiDERmaN",s2="SuPERmaN";
		System.out.println(s2+"--->"+UpperLower(s1,s2));
	}
	
}