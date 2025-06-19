import java.util.Arrays;
class R2 
{
	public static void main(String[] args) 
	{
		int[]a = new int[5];
     double[]b = new double[3];
	 String[]c = new String[5];
	boolean[]d = new boolean[6];
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(c));
		System.out.println(c.length);
		System.out.println(b.length);
		System.out.println(a[7]);//AIOBE--->Array Index Of Bounds Exception 
		System.out.println(a[-1]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
        at R2.main(R2.java:16)

	}
}
