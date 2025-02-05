# SOLID Principles
<hr>

### Single Responsibility Principle (SRP)

Definition: A class should have only one reason to change, meaning it should have only one responsibility.

Poor Example:

In this example, the OrderService class handles both order processing and notification sending, violating SRP.
```
public class OrderService {
    public void processOrder(Order order) {
        // Logic to process the order
        // ...
        sendConfirmationEmail(order);
    }

    private void sendConfirmationEmail(Order order) {
        // Logic to send confirmation email
    }
}
```
Improved Example:

Here, responsibilities are separated into OrderService for order processing and EmailService for sending emails, adhering to SRP.
```
public class OrderService {
    private EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processOrder(Order order) {
        // Logic to process the order
        // ...
        emailService.sendConfirmationEmail(order);
    }
}

public class EmailService {
    public void sendConfirmationEmail(Order order) {
        // Logic to send confirmation email
    }
}
```
<br>
<hr>

### Open/Closed Principle (OCP)

Definition: Software entities should be open for extension but closed for modification.

Poor Example:

Adding a new payment method requires modifying the PaymentProcessor class, violating OCP.
```
public class PaymentProcessor {
    public void processPayment(Order order, String paymentType) {
        if (paymentType.equals("CreditCard")) {
            // Process credit card payment
        } else if (paymentType.equals("PayPal")) {
            // Process PayPal payment
        }
        // Adding a new payment method requires modifying this class
    }
}
```
Improved Example:

Introducing a PaymentMethod interface allows adding new payment methods without modifying existing code, adhering to OCP.
```
public interface PaymentMethod {
    void processPayment(Order order);
}

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(Order order) {
        // Process credit card payment
    }
}

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(Order order) {
        // Process PayPal payment
    }
}

public class PaymentProcessor {
    public void processPayment(Order order, PaymentMethod paymentMethod) {
        paymentMethod.processPayment(order);
    }
}
```
<br>
<hr>

###
Liskov Substitution Principle (LSP)

Definition: Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

Poor Example:

The FreeShippingOrder subclass overrides the calculateTotal method in a way that changes expected behavior, violating LSP.
```
public class Order {
    public double calculateTotal() {
        // Calculate total with shipping
        return itemTotal + shippingCost;
    }
}

public class FreeShippingOrder extends Order {
    @Override
    public double calculateTotal() {
        // Calculate total without shipping
        return itemTotal;
    }
}
```
Improved Example:

The Order class uses a ShippingStrategy to determine shipping costs, allowing for interchangeable behaviors without altering the class hierarchy, adhering to LSP.
```
public class Order {
    private ShippingStrategy shippingStrategy;

    public Order(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateTotal() {
        return itemTotal + shippingStrategy.calculateShippingCost(this);
    }
}

public interface ShippingStrategy {
    double calculateShippingCost(Order order);
}

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(Order order) {
        return 5.99;
    }
}

public class FreeShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(Order order) {
        return 0.0;
    }
}
```
<br>
<hr>

### Interface Segregation Principle (ISP)

Definition: No client should be forced to depend on methods it does not use.

Poor Example:

The OrderService interface forces implementing classes to define methods they may not need, violating ISP.
```
public interface OrderService {
    void processOnlineOrder(Order order);
    void processTelephoneOrder(Order order);
    void processWalkInOrder(Order order);
}

public class OnlineOrderService implements OrderService {
    @Override
    public void processOnlineOrder(Order order) {
        // Process online order
    }

    @Override
    public void processTelephoneOrder(Order order) {
        // Not applicable
    }

    @Override
    public void processWalkInOrder(Order order) {
        // Not applicable
    }
}
```
Improved Example:

Separate interfaces for each order type ensure that implementing classes only depend on relevant methods, adhering to ISP.
```
public interface OnlineOrderService {
    void processOnlineOrder(Order order);
}

public interface TelephoneOrderService {
    void processTelephoneOrder(Order order);
}

public interface WalkInOrderService {
    void processWalkInOrder(Order order);
}

public class OnlineOrderProcessor implements OnlineOrderService {
    @Override
    public void processOnlineOrder(Order order) {
        // Process online order
    }
}
```
<br>
<hr>

### Dependency Inversion Principle (DIP)

Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.

Poor Example:

The OrderService class depends directly on the EmailService class, making it difficult to substitute or mock dependencies, violating DIP.
```
public class OrderService {
    private EmailService emailService = new EmailService();

    public void processOrder(Order order) {
        // Process order
        emailService.sendConfirmationEmail(order);
    }
}
```
Improved Example:

The OrderService class depends on the NotificationService interface, allowing for flexible dependency injection, adhering to DIP.
```
public interface NotificationService {
    void notify(Order order);
}

public class EmailNotificationService implements NotificationService {
    @Override
    public void notify(Order order) {
        // Send email notification
    }
}

public class OrderService {
    private NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notification 
```
