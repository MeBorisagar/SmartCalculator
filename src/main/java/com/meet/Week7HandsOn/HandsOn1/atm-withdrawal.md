## ATM Withdrawal Logic

---

### Task 1 - Pseudocode

START 

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

END

---

### Task 3 - Dry Run Trace

Given :

balance = 3000

count = 0

Transactions = {500,-200,1000,-300,800}

| Iteration | `txns[i]`  | Balance before     | Balance after      | `txns[i] > 0`? | Count |
| ---: |-----------:|-------------------:|-------------------:| :------------: | ----: |
|         1 |        500 |               3000 |               3500 |       Yes      |     1 |
|         2 |       -200 |               3500 |               3300 |       No       |     1 |
|         3 |       1000 |               3300 |               4300 |       Yes      |     2 |
|         4 |       -300 |               4300 |               4000 |       No       |     2 |
|         5 |        800 |               4000 |               4800 |       Yes      |     3 |

---

### Task 4 - Final Output

balance = 4800

count = 3

Explanation : 

Loop is adding every transaction to balance 
   -  3000 + 500 = 3500
   - 3500 - 200 = 3300
   - 3300 + 1000 = 4300
   - 4300 - 300 = 4000
   - 4000 + 800 = 4800

and count is increasing for every deposit. So final balance is 4800 and count is 3.

