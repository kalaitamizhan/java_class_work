class m3 
{
	  protected static char main (char a) 
	{
		System.out.println("Hi iam ram I Like :"+a);
		sita("Ram");
		return '*';
	}
	public static void main(String[]args)
	{
		System.out.println("Hai Iam public"+ main('$'));;
		return;
	}
	  static void sita(String a) 
	{
		System.out.println("I Love :"+a);
		hanuman(true);
		return;
	}
	 private static int hanuman(boolean a) 
	{
		System.out.println("Hi Iam private: "+a);
		
		return 8;
	}
}
