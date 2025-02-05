package org.interview.java8;

import java.util.Comparator;
import java.util.List;

public class SecondLargestNumberInArray {

  public static void main(String[] args) {
    List<Integer> list = List.of(1, 7, 81, 56, 4, 7);
    list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
        .ifPresent(System.out::println);
  }

}
