package org.interview.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {

  public static void main(String[] args) {
    System.out.println(
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10).map(t -> t[0])
            .map(String::valueOf).collect(Collectors.joining(",", "[", "]")));

  }

}
