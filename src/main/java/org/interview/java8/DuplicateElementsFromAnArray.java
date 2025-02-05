package org.interview.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsFromAnArray {

  public static void main(String[] args) {
    List<Integer> list = List.of(1, 3, 1, 7, 8, 7);
    Set<Integer> duplicates = new HashSet<>();
    list.stream().filter(x-> !duplicates.add(x)).forEach(System.out::println);
  }

}
