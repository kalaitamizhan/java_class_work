 /*
    method           returnType     purpose     
----------------     -----------   ---------
data1.equals(data2)	    boolean     compare String Content
                                    	  
 */
import java.util.*;
class S4  
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		System.out.print("Enter the Food 1:");
		String data1=sc.nextLine();
        System.out.print("Enter the Food 2:");
		String data2=sc.nextLine();
		System.out.println(data1==data2);
		System.out.println(data1.equals(data2));
	}
}
