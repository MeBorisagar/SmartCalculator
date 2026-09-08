package com.meet.atm;

public class ComplexityNotes {

    /*
    *
    *
    * ## Complexity Notes

---
### Scenario 1 - Finding one account by ID: linear scan vs HashMap lookup

- Approach A (Linear Scan):
  - Time Complexity: O(N)
  - Explanation: Must check elements one by one. In the worst case, scans all 1,000,000 items.

- Approach B (HashMap Lookup):
  - Time Complexity: O(1) average time
  - Explanation: Uses hash key to locate the record directly in constant time.

- Choice for 1 Million Accounts: HashMap lookup O(1)
  - Reason: O(1) finds the record instantly (~1 operation), whereas O(N) linear scan requires up to
      1,000,000 iterations per query.

---

### Scenario 2 - Finding all overdue accounts: nested loop (compare every pair) vs single pass with a Set of overdue IDs


- Approach A (Nested Loop / Compare Every Pair):
   - Time Complexity: O(N²)
   - Explanation: Compares every record with every other record, resulting in (1,000,000)2 steps.

- Approach B (Single Pass with a Set of Overdue IDs):
  - Time Complexity: O(N)
  - Explanation: Traverses all N accounts once and does an O(1) membership check in the Set per account.

- Choice for 1 Million Accounts: Single Pass with a Set O(N)
  - Reason: O(N2) might not be feasible, while O(N) processes 1,000,000 items in milliseconds.
    * */
}
