import java.util.Scanner;

public class Assignment1Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Base Conversion Program\n");

        System.out.print("Please enter a base (2 – 9): ");
        int base = scanner.nextInt();

        // Calculate largest 4-digit number in base 10: base^4 - 1
        int maxNumber = base * base * base * base - 1;

        System.out.println("\nThe maximum, 4-digit, base 10 number in base " + base + " is " + maxNumber + ".");

        System.out.print("Now, enter a base 10 number in the range 0 to " + maxNumber + " to convert: ");
        int number = scanner.nextInt();

        // Extract each digit manually (no loops, no recursion)
        int digit1 = number / (base * base * base);
        int remainder1 = number % (base * base * base);

        int digit2 = remainder1 / (base * base);
        int remainder2 = remainder1 % (base * base);

        int digit3 = remainder2 / base;
        int digit4 = remainder2 % base;

        // Print digits concatenated (digits are 0 to base-1)
        System.out.println("\n" + number + " (base 10) = " 
            + digit1 + digit2 + digit3 + digit4 + " (base " + base + ")");

        scanner.close();
    }
}
