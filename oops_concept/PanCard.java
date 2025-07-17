import java.util.*;
class PanCard
{
	private String name;
	private String pan_no;
	private int age;
	private long contact;
	static Scanner sc= new Scanner(System.in);
	PanCard(String user_name,String user_pan_no,int user_age,long user_contact)
	{
		name=user_name;
		pan_no=user_pan_no;
		age=user_age;
		contact=user_contact;
	}
	//create getter method
	public String getName()
	{
		return name;
	}
	public String getPan_no()
	{
		return pan_no;
	}
	public int getAge()
	{
		return age;
	}
	public long getContact()
	{
		return contact;
	}
	//create setter method
	public void setName(String new_name)
	{
		if (doverification())
		{
			name=new_name;
			System.out.println("Name updated successfully.....");
		}else
			System.out.println("verification faild.....");
		
	}
	public void setAge(int new_age)
	{
		if (doverification())
		{
			age=new_age;
			System.out.println("Age updated successfully.....");
		}else
			System.out.println("verification faild.....");
		
	}
	public void setContact(long new_contact)
	{
		if (doverification())
		{
			contact=new_contact;
			System.out.println("Contact updated successfully.....");
		}else
			System.out.println("verification faild.....");
		
	}
	//create the method for verification
	public boolean doverification()
	{
		System.out.print("Enter your contact number:");
		long verify_contact=sc.nextLong();
		if (contact==verify_contact)
		{
		
			int otp=new Random().nextInt(100000,999999);
			System.out.println("OTP:"+otp);
			System.out.print("Enter the otp:");
			int verify_otp=sc.nextInt();
			if (otp==verify_otp)
			{
				return true;
			}
		}
		return false;
		
	}
	
}
