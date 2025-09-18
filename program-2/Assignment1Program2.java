import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Base Conversion Program");
    System.out.print("Please enter a base (2 – 9): ");
    int base = scanner.nextInt();

    if (base < 2 || base > 9) {
      System.out.println("Error: Base must be between 2 and 9.");
      scanner.close();
      return;
    }

    // Calculate the largest 4-digit number in the given base:
    // It is (base-1)*(base^3) + (base-1)*(base^2) + (base-1)*(base^1) + (base-1)*(base^0)
    int maxDigit = base - 1;
    int maxNumber = maxDigit * (int)Math.pow(base, 3)
                  + maxDigit * (int)Math.pow(base, 2)
                  + maxDigit * (int)Math.pow(base, 1)
                  + maxDigit * (int)Math.pow(base, 0);

    System.out.println("The maximum, 4-digit, base 10 number in base " + base + " is " + maxNumber + ".");

    System.out.print("Now, enter a base 10 number in the range 0 to " + maxNumber + " to convert: ");
    int number = scanner.nextInt();

    if (number < 0 || number > maxNumber) {
      System.out.println("Error: Number out of range.");
      scanner.close();
      return;
    }

    // Convert the number to the chosen base without loops:
    // Calculate each digit manually:
    int digit1 = number / (int)Math.pow(base, 3);
    int remainder1 = number % (int)Math.pow(base, 3);

    int digit2 = remainder1 / (int)Math.pow(base, 2);
    int remainder2 = remainder1 % (int)Math.pow(base, 2);

    int digit3 = remainder2 / (int)Math.pow(base, 1);
    int digit4 = remainder2 % (int)Math.pow(base, 1);

    // Format digits as a 4-digit string
    String converted = "" + digit1 + digit2 + digit3 + digit4;

    System.out.println(number + " (base 10) = " + converted + " (base " + base + ")");

    scanner.close();
  }
}
