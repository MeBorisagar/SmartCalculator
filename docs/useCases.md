# Use Case Document

### Actor

* User



### UC-01: Perform Basic Calculation


**Given**

* The calculator application is open.

**When**

* The user enters two numbers.
* The user selects one of the basic arithmetic operators (+, –, ×, ÷).
* The user presses the = button or the Enter key.

**Then**

* The calculator performs the calculation.
* The result is displayed on the screen.
* The calculation is saved in the history.


### UC-02: Perform Scientific Calculation


**Given**

* The calculator is running.

**When**

* The user enters a number.
* The user selects a scientific function such as square root, logarithm, factorial, or sine.
* The user evaluates the expression.

**Then**

* The correct result is displayed.
* The calculation is added to the history.


### UC-03: Evaluate Mathematical Expression


**Given**

* The calculator is ready to receive input.

**When**

* The user enters a mathematical expression containing multiple operators and parentheses.
* The user presses =.

**Then**

* The calculator evaluates the expression according to the BODMAS rule.
* The final result is displayed.


### UC-04: View Calculation History


**Given**

* At least one calculation has been performed.

**When**

* The user clicks the History button.

**Then**

* The calculator displays all previous calculations.
* Each entry shows the expression, result, and timestamp.


### UC-05: Reuse a Previous Calculation


**Given**

* The history contains previous calculations.

**When**

* The user selects a calculation from the history.

**Then**

* The selected expression is loaded back into the calculator.
* The user can edit it or evaluate it again.


### UC-06: Clear Calculation History


**Given**

* The history contains one or more calculations.

**When**

* The user selects the Clear History option.

**Then**

* All history entries are removed.


### UC-07: Handle Invalid Input


**Given**

* The calculator is running.

**When**

* The user enters an invalid expression or performs an invalid operation such as division by zero.

**Then**

* The calculator displays an appropriate error message.
* The application continues running without crashing.


### UC-08: Change Calculator Settings

**Given**

* The calculator application is open.

**When**

* The user opens the Settings menu.
* The user changes the decimal precision or switches between Light and Dark themes.

**Then**

* The new settings are applied.
* The preferences are saved for future use.


### UC-09: Clear Current Calculation

**Given**

* The calculator contains an expression or a displayed result.

**When**

* The user clicks Clear or Clear All.

**Then**

* Clear removes the current expression.
* Clear All resets the calculator for a new calculation.


### UC-10: Exit Application


**Given**

* The calculator application is running.

**When**

* The user clicks the Close or Exit option.

**Then**

* The calculator application closes successfully.
