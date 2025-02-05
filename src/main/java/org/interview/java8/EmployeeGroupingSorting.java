package org.interview.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeGroupingSorting {

  public static void main(String[] args) {
    List<Employee> employees = List.of(
        new Employee(1, "rahul", "it", 40000),
        new Employee(2, "shivam", "hr", 30000),
        new Employee(3, "arjun", "hr", 20000),
        new Employee(4, "arpit", "it", 50000));
    //groups employee list on the basis of dept and group the name of employee based on desc order of salary
    employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
            Collectors.collectingAndThen(Collectors.toList(),
                list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .map(Employee::getName).toList())))
        .forEach((key, value) -> System.out.println(key + " : " + value));
  }

}

class Employee {

  int id;
  String name;
  String department;
  double salary;

  public Employee(int id, String name, String department, double salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  public double getSalary() {
    return salary;
  }
}
