import java.util.*;
class MissArr
{
    static Scanner sc=new Scanner(System.in);
    public static void main (String[]args)
    {
       System.out.print("\t\t\t\nEnter the size of the Array:");
       int size=sc.nextInt();
       int []arr=new int[size];
       int n=arr.length;
       for(int i=0;i<n;i++)
       {
           System.out.print("\t\t\t\nEnter the element["+i+"]:");
           arr[i]=sc.nextInt();
       }
       System.out.println(Arrays.toString(arr));
       missing_value(arr);
    }
    public static void missing_value(int[]arr)
    {
        Arrays.sort(arr);
        System.out.println("\nSorted array:"+Arrays.toString(arr));
		     int value=1;
			 for(int i=0;i<arr.length;i++)
            {
              if(value==arr[i])
               {
                   value++;
               }
			   System.out.println("\t\t\t\nThe Missing element is:"+value);
                 value++;
              
    }
	
}
}