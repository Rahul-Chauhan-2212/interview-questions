package org.interview.java8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharaterInAString {

  public static void main(String[] args) {
    //print frequency of each char in desc order
    String name = "rahulchauhan";
    name.chars().mapToObj(c -> (char) c)
        .collect(
            Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().sorted((e1, e2) -> Math.toIntExact(
            e2.getValue() - e1.getValue()))
        .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

  }

}
