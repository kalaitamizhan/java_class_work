class m1
{
	public static void daya(int a)
	{
		System.out.println("Hi from Daya");
		System.out.println("a:"+a);
		System.out.println("Bey from Daya");
	}
	public static void thanga(char a,String b)
	{
		System.out.println("Hi from  Thanga");
		System.out.println("a:"+a+" b:"+b);
		System.out.println("Bey from Thanga");
		daya(13);
	}
	public static void speak(String a)
	{
		System.out.println("Hi from deva");
		System.out.println("Skill:"+a);
		thanga('$',"java");
		System.out.println("Bey from deva");
	}
	public static void main(String[]args)
	{
		System.out.println("Hi From main method");
		speak("java script");
		System.out.println(" Bey From main method");

	}
}