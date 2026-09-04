## Code Review 


```java
public void transfer(String from, String to, double amt) { 
    try { 
        accounts.get(from).setBalance(accounts.get(from).getBalance() - amt); 
        accounts.get(to).setBalance(accounts.get(to).getBalance() + amt); 
    } catch (Exception e) { 
        // ignore 
    } 
} 

 
```

---

### 1) Using double for financial amounts

Severity: Major

Floating-point arithmetic can introduce precision errors, which is unsafe for financial transactions.

Fix :
Use BigDecimal for the transfer amount and account balances.

### 2) Repeated Map look-ups 
Severity: Minor

accounts.get(from) and accounts.get(to) are called multiple times. This makes the code harder to read and unnecessarily repeats the lookup.

Fix :
```java
Account fromAccount = accounts.get(from);
Account toAccount = accounts.get(to);
```
### 3) Transfer is not atomic
Severity: Blocker

If the first update succeeds but the second update fails, money can be deducted from the source account without being credited to the destination account.

Fix : Perform the transfer as one atomic operation


### 4) Catching Exception too broadly
Severity: Major

The method catches the generic Exception type: catch (Exception e). This can hide many different programming and business errors, making the actual problem difficult to identify and debug.

Fix : Catch only specific exceptions that the method can reasonably handle

### 5) Silently ignoring the exception
Severity: Major

The catch block contains: `// ignore`.
This means a failed transfer can occur without the caller knowing that the operation failed.

Fix : Handle the exception and provide meaningful message.