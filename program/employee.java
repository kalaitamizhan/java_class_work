import java.util.*;
class employee
{
	static Scanner ak = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter your ID:");
		int id=ak.nextInt();
		System.out.print("\t\t\tEnter your Salary:");
		double sal=ak.nextDouble();
		System.out.print("\t\t\tEnter your Contact:");
		long contact=ak.nextLong();
		System.out.print("\t\t\tEnter your Name first character:");
		char letter=ak.next().charAt(0);
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Salary : "+sal);
		System.out.println("Employee Contact : "+contact);
		System.out.println("Employee Name First Character : "+letter);
	}
}