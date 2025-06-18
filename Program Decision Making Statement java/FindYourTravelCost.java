import java.util.Scanner;
class FindYourTravelCost
{
	static Scanner sc=new Scanner(System.in);
   public static void main(String[]args)
	{
	   System.out.println("\t\t\tStart The Program");
	   System.out.println("\t\t\t..................");
		System.out.print("\n\t\t\tEnter The Today Petrol Price: ");
		double petrolPrice=sc.nextDouble();
		System.out.print("\t\t\tEnter Your Bick Milage: ");
		double mileage=sc.nextDouble();
		System.out.print("\t\t\tEnter Number Of Kelometer To Travel: ");
		double distance=sc.nextDouble();
		System.out.print("\t\t\tEnter Speed (km/h): ");
		double speed =sc.nextDouble();
		double petrolneeded=distance/mileage;
		double totalCost=petrolneeded*petrolPrice;
       String mileageRating;
		if (mileage < 20) {
            mileageRating = "Poor mileage";
        } else if (mileage <= 50) {
            mileageRating = "Average mileage";
        } else if (mileage > 60) {
            mileageRating = "Good mileage";
        } else {
            mileageRating = "Moderate mileage";
        }
		double timeHours=distance / speed;
		System.out.println("\n----Travel Summary-----\n");
		System.out.println(petrolneeded+"liters");
		System.out.println("total cost:"+totalCost);
		System.out.println("mileage rating:"+ mileageRating);
		System.out.println("Estimate travel time"+ timeHours);

		
	}
}
