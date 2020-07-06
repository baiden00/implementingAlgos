import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(reader);

    try {
        double purchasePrice = Double.parseDouble(in.readLine());
        double cash = Double.parseDouble(in.readLine());
        Main.calculateChange(purchasePrice, cash);
    } catch (Exception e) {
        System.out.println(e);
    }
  }

  public static void calculateChange(double purchasePrice, double cash) {
    // Access your code here. Feel free to create other classes as required

    //If Price==Cash, we print out Zero.
    if(purchasePrice==cash){
      System.out.println("Zero");

    //Else, if the cash is insufficient, we print out ERROR
    }else if(cash < purchasePrice){
      System.out.println("ERROR");

    //Here is where we do the actual work.
    }else{
      double changeDue = cash - purchasePrice;

      //HashMap to store String and monetary value.
      HashMap<Double, String> map = new HashMap<Double, String>();
      map.put(0.01, "One Pence");
      map.put(0.02, "Two Pence");
      map.put(0.05,"Five Pence");
      map.put(0.10, "Ten Pence");
      map.put(0.20, "Twenty Pence");
      map.put(0.50, "Fifty Pence");
      map.put(1.00, "One Pound");
      map.put(2.00, "Two Pounds");
      map.put(5.00, "Five Pounds");
      map.put(10.00, "Ten Pounds");
      map.put(20.00, "Twenty Pounds");
      map.put(50.00, "Fifty Pounds");

      double[] monetaryValues = {0.01,0.02,0.05,0.10,0.20,0.50,1.00,2.00,5.00,10.00,20.00,50.00};

      int pointer = monetaryValues.length-1;
      String output = "";

      /**
      Algorithm
    Iterating over the double array checking each monetary value to see if it's less than the changeDue.
    If it's less, it means we can subtract that value and append the string representation of that value
    to our output. We keep on doing that while curr < changeDue to get minimum notes.
    We get the string representation by the key value hashmap.
    *We then update our change due and continue the process untill we reach 2.
    The reason for that is, I figured Five Pence might be the biggest monetary value that would give
    least number of notes from the test cases.

      Time Complexity O(n) for iteration over array. Space Complexity 2*O(n) for hashmap and the array
   */

      while(changeDue > 0 && pointer >= 2){
        double curr = monetaryValues[pointer];
        if(curr < changeDue){
          while(curr < changeDue){
            String appendToOutput = map.get(curr);
            output= output + appendToOutput + ", ";
            changeDue = changeDue-curr;
          }
         pointer-=1;
        }else{
          pointer-=1;
        }
      }

      System.out.println(output + "Five Pence");

    }

  }

}
