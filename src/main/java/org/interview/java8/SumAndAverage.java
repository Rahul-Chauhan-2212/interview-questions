package org.interview.java8;

import java.util.List;

public class SumAndAverage {

  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    list.stream().mapToInt(i -> i).average().ifPresent(System.out::println);
    System.out.println(list.stream().mapToInt(i -> i).sum());
  }

}
