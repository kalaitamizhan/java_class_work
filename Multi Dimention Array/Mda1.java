import java.util.*;
class Mda2 
{   static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) 
	{
         int[][]a=new int[3][3];
		 //Storeing
		 for (int i=0;i<a.length;i++)
		 {
			 for (int j=0;j<a[i].length;j++)
			 {
				System.out.print("Enter the Element:");
					a[i][j]=sc.nextInt();
			 }
			 System.out.println();
		 }
		 System.out.println(a);
		 //Printing
		 for (int i=0;i<a.length;i++)
		 {
			 for (int j=0;j<a[i].length;j++)
			 {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}
