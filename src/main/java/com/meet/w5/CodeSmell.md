## Code Review 

### Given Code 

```java
void process(List<Loan> l) {
    for(int i=0;i<l.size();i++){
        if(l.get(i).principal>500000&&l.get(i).principal<2000000)
            System.out.println(l.get(i).loanId);
    }
}
```

### Code Smells 

1) Poor naming : name should give idea about what method actually does. 
2) Unnecessary Indexed Loop : function is calling get(i) twice for getting the same loan.
3) Magic number : constants with meaningful name  can be used in if condition.


### Refactored Code


```java

private static final double MIN_ELIGIBLE_PRINCIPAL = 500_000;
private static final double MAX_ELIGIBLE_PRINCIPAL = 2_000_000;

void printEligibleLoanIds(List<Loan> loans) {
    for (Loan loan : loans) {
        if (loan.getPrincipal() > MIN_ELIGIBLE_PRINCIPAL
                && loan.getPrincipal() < MAX_ELIGIBLE_PRINCIPAL) {
            System.out.println(loan.getLoanId());
        }
    }
}
```