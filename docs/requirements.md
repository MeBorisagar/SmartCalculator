### C2.1 Functional Requirements

#### FR1
The system shall allow customers to enter their monthly income.

#### FR2
The system shall allow customers to enter their existing loan amount.

#### FR3
The system shall allow customers to enter the requested loan amount.

#### FR4
The system shall evaluate the entered information using the bank's eligibility rules and determine whether the customer is eligible.

#### FR5
The system shall display the eligibility result along with the reason for the decision.


### C2.2 Non-Functional Requirements

#### NFR1 – Performance
The system shall display the eligibility result within 5 seconds after the customer submits the required information.

#### NFR2 – Security
The system shall encrypt customer financial information during transmission and store it securely according to the bank's security policies.

#### NFR3 – Availability
The Loan Eligibility Checker shall be available 99.9% of the time.


### C2.3 Scope Boundaries

#### SB1
The feature will not approve or reject the actual loan application; it only checks eligibility.

#### SB2
The feature will not calculate loan interest rates or generate repayment schedules.