class R1 
{ 
	static int start=1,end=5;
	public static void main(String[] args) 
	{
		System.out.println("\t\t\tstart");
		display();
		System.out.println("\t\t\tends");
	}
	public static void display()
	{  
		if (start<=end)
		{
			System.out.println("\t\t\t"+start++);
			display();
		}
	}
}
