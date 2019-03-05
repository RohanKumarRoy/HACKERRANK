import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
    String inputTime = input.nextLine();
    String [] tempArray = inputTime.split(":");
    String hours = tempArray[0];
    String minutes = tempArray[1];
    String seconds = tempArray[2].substring(0, 2);
    
    int tempHours;
    
    if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
      if (Integer.parseInt(hours) < 12) {
        tempHours = Integer.parseInt(hours);
        tempHours += 12;
        hours = Integer.toString(tempHours);
      }
    }
    if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
      if (Integer.parseInt(hours) == 12) {
        hours = "00";
      }
    }
    System.out.println(hours + ":" + minutes + ":" + seconds);

  }
}
