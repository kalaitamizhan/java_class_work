import java.util.*;
class Mda2
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
         int [][]arr=new int[3][3];
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
            System.out.print("Enter the element["+i+"]["+j+"]:");
            arr[i][j]=sc.nextInt();  
            }  
            System.out.println(); 
         }
          for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();   
         }
        
         
    }
}