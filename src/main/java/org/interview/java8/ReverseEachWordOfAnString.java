package org.interview.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfAnString {

  public static void main(String[] args) {
    String str = "Ram plays with dog";
    System.out.println(
        Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
            .collect(
                Collectors.joining(" ")));
  }

}
