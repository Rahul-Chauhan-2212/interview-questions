package org.interview.java8;

import java.util.Arrays;

public class SumOfAllDigitsOfANumber {

  public static void main(String[] args) {
    int number = 647623;
    System.out.println(
        Arrays.stream(String.valueOf(number).split("")).mapToInt(digit -> Integer.parseInt(digit))
            .sum());
  }

}
