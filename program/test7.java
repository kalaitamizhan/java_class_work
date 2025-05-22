class test7 
{
	public static void main(String[] args) 
	{
		//before swapimg
		int a=5,b=10;
		System.out.println("before swaping");
		System.out.println("a:"+a+",b:"+b);
		//after swaping
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping");
		System.out.println("a:"+a+",b:"+b);
	}
}
