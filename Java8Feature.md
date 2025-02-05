# Java 8 Features

### Collection vs Stream

Collection:
<li>A data structure that holds elements in memory</li>
<li>Elements are added or removed from the collection</li>
<li>Supports both iteration and random access</li>

Stream:
<li>A sequence of elements computed on-demand</li>
<li>Does not store elements; it processes them through a pipeline of operations</li>
<li>Once consumed, it cannot be reused</li>

### Functional Interface

A functional interface is an interface with exactly one abstract method. They can have multiple
default or static methods but only one abstract method. Functional interfaces are the foundation of
lambda expressions.
Built-in functional interfaces:
<li>Predicate< T >: Represents a boolean-valued function of one argument</li>
<li>Function< T, R >: Represents a function that accepts one argument and produces a result</li>
<li>Supplier< T >: Represents a supplier of results</li>
<li>Consumer< T >: Represents an operation that accepts a single input argument and returns no result</li>

### Lambda Expressions

Lambda expressions are anonymous functions that enable treating functionality as a method argument
or treating code as data. They provide a clear and concise way to represent a single method
interface using an expression.

```
(parameters) -> expression
```

### Stream API

The Stream API provides a functional approach to processing sequences of elements, such as
collections. It allows for operations like filtering, mapping, and reducing, enabling efficient and
concise data manipulation.

### Default Methods

The default methods allows interfaces to have concrete methods with a default implementation. This
feature enables the addition of new methods to interfaces without breaking existing implementations.

```
public interface Vehicle {
    void start();
    default void stop() {
        System.out.println("Vehicle stopped.");
    }
}
```

### Method Reference

Method references provide a shorthand notation for calling a method via a lambda expression. They
enhance code readability by reducing boilerplate code.
Types of method references:
<li>Reference to a static method: ClassName::staticMethodName</li>
<li>Reference to an instance method of a particular object: instance::instanceMethodName</li>
<li>Reference to an instance method of an arbitrary object of a particular type: ClassName::instanceMethodName</li>
<li>Reference to a constructor: ClassName::new</li>

### Optional Class

The Optional class is a container object used to represent the presence or absence of a value. It
helps in avoiding NullPointerException and provides methods to deal with non-existent values
gracefully.