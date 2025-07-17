class user_verification 
{
	public static void main(String[] args) 
	{
		user user1=new user("Daya","daya123@gmail.com",24,96591700465l) ;
		
		System.out.println(user1.getName());
		System.out.println(user1.getEmail());
		System.out.println(user1.getAge());
		System.out.println(user1.getContact());
         user1.setAge(17);
         System.out.println(user1.getAge());
		
	}
}
