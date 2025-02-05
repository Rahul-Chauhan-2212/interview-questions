package org.interview.java8;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class SecondNonRepeatingCharacter {


  public static void main(String[] args) {
    //prints second non-repeating char
    String name = "rahulchauhan";
    name.chars().mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
        .entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() == 1)
        .skip(1).limit(1)
        .findFirst()
        .ifPresent(characterLongEntry -> System.out.println(characterLongEntry.getKey()));

  }
}

