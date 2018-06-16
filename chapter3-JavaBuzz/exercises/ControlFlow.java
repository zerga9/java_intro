// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
public static void main(String args[]) {
  System.out.println("Enter a number here: ");
  // find a way to read in user input
  Scanner input = new Scanner(System.in);
  // write a method that will check if a number is odd or even
  // (assume user only ever enters integers)
  int number = input.nextInt();

  String result;

  if(number%2 == 0) {
    result = "even number";
  } else {
    result = "odd number";
  }
// print the answer to the console
  String message = String.format("You've entered a %s.", result);
  System.out.println(message);
  }
}
