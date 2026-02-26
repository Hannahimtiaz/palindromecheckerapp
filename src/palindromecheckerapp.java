
import java.util.Scanner;
import java.util.Stack;

    public class palindromecheckerapp {



        public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                // Take user input
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Create a Stack to store characters
                Stack<Character> stack = new Stack<>();

                // Push each character of the string into the stack
                for (char c : input.toCharArray()) {
                    stack.push(c);
                }

                // Assume palindrome initially
                boolean isPalindrome = true;

                // Compare by popping from stack
                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);

                scanner.close();
            }
        }
