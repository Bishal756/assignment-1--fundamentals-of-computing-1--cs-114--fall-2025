import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
    public static void main(String[] args) {
        // Print initials in block letters (example: R and V)
        System.out.println("RRRRRRRR    VVV         VVV");
        System.out.println("RRR    RRR   VVV       VVV");
        System.out.println("RRR    RRR    VVV     VVV");
        System.out.println("RR RRR         VVV   VVV");
        System.out.println("RRR  RRR        VVV VVV");
        System.out.println("RRR    RRR       VVVVV");
        System.out.println("RRR      RRR      VVV");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // Step 2: Get 5-character string input
        System.out.println("Please enter a 5-character string:");
        String inputString = scanner.nextLine();

        // Validate input length
        while (inputString.length() != 5) {
            System.out.println("Invalid input. Please enter exactly 5 characters:");
            inputString = scanner.nextLine();
        }

        // Trim first and last characters
        String middle = inputString.substring(1, 4);

        // Reverse the middle string
        String reversedMiddle = "";
        for (int i = middle.length() - 1; i >= 0; i--) {
            reversedMiddle += middle.charAt(i);
        }

        // Step 3: Get Fahrenheit input and convert to Celsius
        System.out.println("Please enter a number in Fahrenheit:");
        double fahrenheit = 0;
        boolean validFahrenheit = false;
        while (!validFahrenheit) {
            try {
                fahrenheit = Double.parseDouble(scanner.nextLine());
                validFahrenheit = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid number in Fahrenheit:");
            }
        }
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Step 4: Generate random number between 32 and 16384 inclusive
        Random random = new Random();
        int randomNumber = random.nextInt(16384 - 32 + 1) + 32;

        System.out.println("\nRandom number generated. Continuing...\n");

        // Step 5: Combine and print results
        // Format Celsius to 1 decimal place
        String celsiusFormatted = String.format("%.1f", celsius);

        System.out.println("Your new string is " + celsiusFormatted + reversedMiddle + randomNumber);

        scanner.close();
    }
}
