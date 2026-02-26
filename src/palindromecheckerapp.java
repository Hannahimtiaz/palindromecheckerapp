
import java.util.Scanner;
public class palindromecheckerapp {

    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase2PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 2: Palindrome Validation using User Input
         *
         * Description:
         * This class demonstrates palindrome validation
         * using a string entered by the user.
         *
         * @author Developer
         * @version 2.0
         */




            Scanner scanner = new Scanner(System.in);

            System.out.println("Input text:");
            String input = scanner.nextLine();

            boolean isPalindrome = true;

            // Loop only till half of the string length
            for (int i = 0; i < input.length() / 2; i++) {

                // Compare characters from start and end
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            if (isPalindrome) {
                System.out.println(input + " is a Palindrome.");
            } else {
                System.out.println(input + " is NOT a Palindrome.");
            }

            scanner.close();
        }
    }