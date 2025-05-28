import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select H Input:\n1. ITI\n2. Dhasa");
        int hInput = scanner.nextInt();

        switch (hInput) {
            case 1: // ITI
                System.out.println("ITI price is 50");
                break;

            case 2: // Dhasa
                System.out.println("Dhosa price is 60");

                System.out.println("Select H Input:\n1. Takeriz\n2. Nogang");
                int trainerInput = scanner.nextInt();

                switch (trainerInput) {
                    case 1:
                        System.out.println("Takeriz is your trainer");
                        break;
                    case 2:
                        System.out.println("Nogang is your trainer");
                        break;
                    default:
                        System.out.println("Invalid trainer selection.");
                }
                break;

            default:
                System.out.println("Invalid H Input selection.");
        }

        System.out.println("Select H Input:\n1. Food\n2. 8 Kill");
        int finalInput = scanner.nextInt();

        switch (finalInput) {
            case 1:
                System.out.println("You selected Food.");
                break;
            case 2:
                System.out.println("You selected 8 Kill.");
                break;
            default:
                System.out.println("Invalid final selection.");
        }

        scanner.close();
    }
}