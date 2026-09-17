## ATM Pseudocode


```
SET attempts to 0

    WHILE attempts < 3 : 
    
        DISPLAY :  "Enter ithdrawal amount"
    
        IF withdrawal amount < 500 :
            Display : "Withdrawal must be at least 500" 
            attempts = attempts + 1
    
        ELSE IF withdrawal amount > 20000 :
            Display : "Withdrawal cannot exceed 20,000" 
            attempts = attempts + 1
    
        ELSE IF withdrawal amount % 500 != 0:
            Display : "Withdrawal must be a multiple of 500" 
            attempts = attempts + 1
    
        ELSE IF withdrawal amount > balance:
            Display : "Insufficient balance" 
            attempts = attempts + 1
    
        ELSE balance = balance - withdrawal : 
            Display : "Withdrawal successful" 
            Display : balance 
            STOP

    END WHILE

Display : "Maximum attempts reached. Your card is locked."
```