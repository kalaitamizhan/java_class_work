class AreaOfCircle
{
	public static double CalculateCircleArea(double radius)
	{
		System.out.println("Calculating area for circle with radius :"+ radius);
		double area=3.14*radius*radius;
		return area;
	}
	public static void main(String[]args)
	{
		System.out.println("Start");
		System.out.println("Area of circle is:"+ (CalculateCircleArea(5)));
		System.out.println("Ends");

	}
}
