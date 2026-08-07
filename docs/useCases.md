# Use Case Document

## Actor

- User



### UC-01: Perform Arithmetic Calculation

### Given

- The calculator application is running.

### When

- The user enters the first number.
- The user enters an arithmetic operator (+, -, *, /, %).
- The user enters the second number.
- The user presses **Enter**.

### Then

- The calculator evaluates the operation.
- The result is displayed to two decimal places.



### UC-02: Perform Multiple Calculations

### Given

- The calculator application is running.

### When

- The user completes a calculation.

### Then

- The calculator prompts the user for another calculation.
- The application continues running until the user enters **exit**.



### UC-03: Handle Invalid Input

### Given

- The calculator application is running.

### When

- The user enters an invalid number or an unsupported arithmetic operator.

### Then

- The calculator displays a meaningful error message.
- The user is prompted to enter the input again.
- The application continues running.



### UC-04: Handle Arithmetic Errors

### Given

- The calculator application is running.

### When

- The user performs an invalid arithmetic operation, such as division by zero.

### Then

- The calculator displays an appropriate error message.
- The application continues running without terminating.



### UC-05: Exit Application

### Given

- The calculator application is running.

### When

- The user enters the **exit** command.

### Then

- The calculator terminates gracefully.
- A goodbye message is displayed.