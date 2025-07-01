/*
convert char[] into String
*/
import java.util.*;
class S6 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		char[]a={'A','B','C','D'};
		
		String s=new String(a);
		System.out.println(Arrays.toString(a)+"---->"+s);
	}
}
