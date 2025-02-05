package org.interview.java8;

import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayToOneSortedArray {

  public static void main(String[] args) {
    List<Integer> list1 = List.of(11, 21, 33, 42, 15, 56, 7, 18, 99, 10);
    List<Integer> list2 = List.of(10, 22, 32, 41, 14, 55, 78, 8, 9, 1);
    //with duplicates
    IntStream.concat(list1.stream().mapToInt(value -> value),
        list2.stream().mapToInt(value -> value)).sorted().forEach(System.out::println);
    //without duplicates
    IntStream.concat(list1.stream().mapToInt(value -> value),
        list2.stream().mapToInt(value -> value)).sorted().distinct().forEach(System.out::println);
  }

}
