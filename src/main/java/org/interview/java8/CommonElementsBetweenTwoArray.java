package org.interview.java8;

import java.util.List;

public class CommonElementsBetweenTwoArray {

  public static void main(String[] args) {
    List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> list2 = List.of(11, 12, 13, 14, 5, 6, 7, 8, 19, 20);
    list1.stream().filter(list2::contains).forEach(System.out::println);
  }

}
