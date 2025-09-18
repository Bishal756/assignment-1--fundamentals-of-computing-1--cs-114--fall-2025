import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {
    // Define initials as arrays of strings (5 lines each)
    String[] firstInitial = {
      "AAAAA",
      "A   A",
      "AAAAA",
      "A   A",
      "A   A"
    };

    String[] lastInitial = {
      "BBBB ",
      "B   B",
      "BBBB ",
      "B   B",
      "BBBB "
    };

    // Print initials (no loops)
    System.out.println(firstInitial[0] + "   " + lastInitial[0]);
    System.out.println(firstInitial[1] + "   " + lastInitial[1]);
    System.out.println(firstInitial[2] + "   " + lastInitial[2]);
    System.out.println(firstInitial[3] + "   " + lastInitial[3]);
    System.out.println(firstInitial[4] + "   " + lastInitial[4]);

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // Ask user for a 5-character string
    System.out.print("Enter a 5-character string: ");
    String input = scanner.nextLine();

    if (input.length() != 5) {
      System.out.println("Error: String must be exactly 5 characters.");
      scanner.close();
      return;
    }

    // Extract middle 3 characters
    String middle = input.substring(1, 4);

    // Reverse middle 3 characters manually (no loops)
    char c0 = middle.charAt(0);
    char c1 = middle.charAt(1);
    char c2 = middle.charAt(2);
    String reversedMiddle = "" + c2 + c1 + c0;

    // Ask user for Fahrenheit temperature
    System.out.print("Enter temperature in Fahrenheit: ");
    String tempStr = scanner.nextLine();

    // Basic validation: check first 3 chars only (no loops)
    boolean valid = true;
    if (tempStr.length() == 0) {
      valid = false;
    } else {
      char ch0 = tempStr.charAt(0);
      if (!((ch0 >= '0' && ch0 <= '9') || ch0 == '.')) {
        valid = false;
      }
      if (tempStr.length() > 1) {
        char ch1 = tempStr.charAt(1);
        if (!((ch1 >= '0' && ch1 <= '9') || ch1 == '.')) {
          valid = false;
        }
      }
      if (tempStr.length() > 2) {
        char ch2 = tempStr.charAt(2);
        if (!((ch2 >= '0' && ch2 <= '9') || ch2 == '.')) {
          valid = false;
        }
      }
    }

    if (!valid) {
      System.out.println("Error: Invalid temperature input.");
      scanner.close();
      return;
    }

    // Convert to double
    double fahrenheit = Double.parseDouble(tempStr);

    // Convert Fahrenheit to Celsius
    double celsius = (fahrenheit - 32) * 5 / 9;

    // Generate random number between 32 and 16384 inclusive
    int randNum = random.nextInt(16384 - 32 + 1) + 32;

    // Print combined result
    System.out.println("Combined result: " + reversedMiddle + celsius + randNum);

    scanner.close();
  }
}
