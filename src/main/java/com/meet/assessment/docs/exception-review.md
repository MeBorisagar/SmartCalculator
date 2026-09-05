## Exception Handling Code Review

### Given Code

```java
public void processPayment(double amount) { 
    try { 
        if (amount <= 0) throw new Exception("bad"); 
        // deduct from account 
    } catch (Exception e) { 
        // silent 
    } 
}
```

---

### Problems 

1) The catch block silently ignores the caught exception without handling it.
2) The method throws a raw Exception instead of a specific domain-relevant exception.
3) Exception message "bad" provides zero context about the problem.

---

### Corrected Code
```java
public void processPayment(double amount) {
    try {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than zero. Provided: " + amount);
        }
        // deduct from account

    } catch (IllegalArgumentException e) {
        log.error("Payment failed : {}", e.getMessage());
    }
}
```

