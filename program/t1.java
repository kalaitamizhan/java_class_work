class t1
{
	public static void main(String[]args)
	{
		int a=12,b=10;
		int c= a++ + b++;//c:12+11=23
		int ans=(++a + ++c)+b;//ans:14+24+11=49
		 a+=51;
			System.out.println("a:"+a);
		    System.out.println("b:"+b);
			System.out.println("c:"+c);
		    System.out.println("Answer:"+ans);
}}
