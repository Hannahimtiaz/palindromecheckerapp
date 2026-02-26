
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

    public class palindromecheckerapp {
        public static void main(String[] args){



                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter a string to validate: ");
                    String input = scanner.nextLine(); // Based on hint

                    // Create a Queue to store characters in FIFO order
                    Queue<Character> queue = new LinkedList<>();

                    // Create a Stack to store characters in LIFO order
                    Stack<Character> stack = new Stack<>();

                    // Insert each character into both queue and stack
                    for (char c : input.toCharArray()) {
                        queue.add(c);
                        stack.push(c);
                    }

                    // Flag to track palindrome status
                    boolean isPalindrome = true;

                    // Compare characters until the queue becomes empty
                    while (!queue.isEmpty()) {
                        // FIFO: removes the first char added
                        char fromQueue = queue.remove();
                        // LIFO: removes the last char added
                        char fromStack = stack.pop();

                        if (fromQueue != fromStack) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    // Display results
                    if (isPalindrome) {
                        System.out.println("The string \"" + input + "\" is a palindrome.");
                    } else {
                        System.out.println("The string \"" + input + "\" is NOT a palindrome.");
                    }

                    scanner.close();
                }
            }
