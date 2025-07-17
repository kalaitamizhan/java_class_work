import java.util.*;
class user 
{
	private String name;
	private String email;
	private int age;
	private long contact;
	
	static Scanner sc=new Scanner(System.in);
	user(String user_name,String user_email,int user_age,long user_contact)
		{
		 name=user_name;
		 email=user_email;
		 age=user_age;
		 contact=user_contact;
	    }
		
	// A method for verification and Authorised person
	
		public boolean do_verification()
	{
		System.out.print("Enter the Contact:");
		long verify_contact=sc.nextLong();
		if (verify_contact==contact)
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
	
	//create the getter method
		
		public String getName(){
		return name; 
	}	
		public String getEmail(){
		return email; 
	}
		public int getAge(){
		return age; 
	}
		public long getContact(){
		return contact; 
	}
	
	//create the setter method
	
	public void setName(String new_name)
	{
		if (do_verification())
		{
			name=new_name;
			System.out.println("Name verification done.....");
		}else
		{
		System.out.println("Verification faild.....");
		}
	}
	public void setEmail(String new_email)
	{
		if (do_verification())
		{
			email=new_email;
			System.out.println("Email verification done.....");
		}else
		{
		System.out.println("Verification faild.....");
		}
	}
	public void setAge(int new_age)
	{
		if (do_verification())
		{
			age=new_age;
			System.out.println("Age verification done.....");
		}else
		{
		System.out.println("Verification faild.....");
		}
	}
		public void setContact(long new_contact)
	{
		if (do_verification())
		{
			contact=new_contact;
			System.out.println("Contact verification done.....");
		}else
		{
		System.out.println("Verification faild.....");
		}
	}
			
}
