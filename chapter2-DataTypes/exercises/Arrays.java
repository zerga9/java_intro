import java.util.*;
// can you remember how to set up your main function?
public class Arrays {
  public static void main(String[] args){


// declare an array of Strings and print it
String[] arr = new String[] {"Gadi", "Mo", "Samira"};

// declare an array of integers and print it
int[] arrInt = new int[] { 1, 2, 3 };

// declare an ArrayList of integers, add numbers to it, and then print it
ArrayList<Integer> arrL = new ArrayList<Integer>(3);
 arrL.add(1);
 arrL.add(3);
 arrL.add(5);

 System.out.println(java.util.Arrays.toString(arr));
 System.out.println(java.util.Arrays.toString(arrInt));
 System.out.println(arrL);
  }
}
