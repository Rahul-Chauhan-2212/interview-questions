package org.interview.java8;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {

  public static void main(String[] args) {
    List<String> list = List.of("apple", "orange", "banana");
    //joins list of string based on delimiter, prefix and suffix
    System.out.println(list.stream().collect(Collectors.joining(",", "-", "@")));
  }

}
