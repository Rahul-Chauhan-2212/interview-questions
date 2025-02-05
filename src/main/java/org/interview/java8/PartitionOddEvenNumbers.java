package org.interview.java8;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class PartitionOddEvenNumbers {

  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0)).entrySet().stream().map(
        Entry::getValue).forEach(System.out::println);
  }

}
