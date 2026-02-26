import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

    public class palindromecheckerapp {
        public static void main(String[] args){


                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter a string to check if it's a palindrome: ");
                    String input = scanner.nextLine();

                    // Normalize input (optional: remove spaces and ignore case)
                    String processedInput = input.replaceAll("\\s+", "").toLowerCase();

                    // Create a Deque to store characters
                    Deque<Character> deque = new ArrayDeque<>();

                    // Add each character to the deque
                    for (char c : processedInput.toCharArray()) {
                        deque.addLast(c);
                    }

                    // Flag to track palindrome result
                    boolean isPalindrome = true;

                    // Continue comparison while more than one element exists
                    while (deque.size() > 1) {
                        char first = deque.removeFirst();
                        char last = deque.removeLast();

                        if (first != last) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    // Output the result
                    if (isPalindrome) {
                        System.out.println("\"" + input + "\" is a palindrome.");
                    } else {
                        System.out.println("\"" + input + "\" is not a palindrome.");
                    }

                    scanner.close();
                }
            }
