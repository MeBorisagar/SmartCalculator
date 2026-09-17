## ATM Withdrawal Dry Run


Initial values:

```text
balance = ₹10,000
attempts = 0
amount = ₹7,500
MAX_ATTEMPTS = 3
```

## Dry Run

| Step | Variable / Condition            |      Value | Result / Explanation            |
| ---- | ------------------------------- | ---------: | ------------------------------- |
| 1    | `balance`                       |    ₹10,000 | Initial account balance         |
| 2    | `failedAttempts`                |          0 | No failed attempts              |
| 3    | `MAX_ATTEMPTS`                  |          3 | Maximum allowed failed attempts |
| 4    | `amount`                        |     ₹7,500 | User enters ₹7,500              |
| 5    | `failedAttempts < MAX_ATTEMPTS` |     `true` | `0 < 3`, so the loop continues  |
| 6    | `amount < MIN_WITHDRAWAL`       |    `false` | ₹7,500 is greater than ₹500     |
| 7    | `amount > MAX_WITHDRAWAL`       |    `false` | ₹7,500 is less than ₹20,000     |
| 8    | `amount % 500 != 0`             |    `false` | ₹7,500 is a multiple of ₹500    |
| 9    | `amount > balance`              |    `false` | ₹7,500 is less than ₹10,000     |
| 10   | `balance -= amount`             |     ₹2,500 | ₹7,500 is deducted from ₹10,000 |
| 11   | `failedAttempts`                |          0 | No validation rule was violated |
| 12   | Withdrawal result               | Successful | Withdrawal is completed         |

