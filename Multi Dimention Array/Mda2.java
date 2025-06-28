import java.util.*;
class Mda2
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the size of element:");
         int size=sc.nextInt();
         int []arr=new int[size];
         int maximum=Integer.MIN_VALUE,minimum=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++)
         {
            System.out.print("Enter the element:");
            arr[i]=sc.nextInt();
             maximum=Math.max(arr[i],maximum);
            minimum=Math.max(arr[i],minimum);
         }
         System.out.println("Maximum number is:"+maximum);
         System.out.println("Minimum number is:"+minimum);
    }
}