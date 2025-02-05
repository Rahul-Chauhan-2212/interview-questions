### Design Principles

<ol>
<li>

<b>[Solid Principles](SOLID.md)</b>
</li>
<li>
<b>Don’t Repeat Yourself (DRY)</b>

Definition: Avoid code duplication by abstracting common functionality into reusable components.

Example:

Instead of duplicating validation logic across multiple classes, create a utility class:

```
public class ValidationUtils {
    public static boolean isValidEmail(String email) {
        // Email validation logic
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Phone number validation logic
    }
}
```

By centralizing validation methods, you ensure consistency and ease of maintenance.
</li>
<li>
<b>Keep It Simple, Stupid (KISS)</b>
Definition: Design systems as simple as possible, avoiding unnecessary complexity.

Example:

Instead of creating a complex method to calculate the sum of numbers:

```
public int sum(int[] numbers) {
    int result = 0;
    for (int number : numbers) {
        result += number;
    }
    return result;
}
```

This straightforward approach is easier to understand and maintain.
</li>
<li>
<b>You Aren’t Gonna Need It (YAGNI)</b>
Definition: Don’t implement features until they are necessary.

Example:

Avoid adding methods or classes for future requirements that might never materialize. Focus on
current needs to keep the codebase lean and manageable.
</li>
<li>
<b>Composition Over Inheritance</b>
Definition: Favor composing objects with desired behaviors over inheriting from a base class.

Example:

Instead of using inheritance:

```
public class Engine {
    public void start() {
        // Start the engine
    }
}

public class Car extends Engine {
    // Car-specific methods
}
```

Use composition:

```
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    // Car-specific methods
}
```

This approach provides greater flexibility and reduces tight coupling between classes.
</li>
</ol>

<hr>
<br>
<hr>

### Java 8 Features

[Java 8 Features](Java8Feature.md)

