# Square Root Pseudocode

```
FUNCTION calculateSquareRoot(number):

    IF number < 0 THEN
        THROW NegativeSquareRootException( "Cannot calculate square root of a negative number" )
    END IF

    SET Result = MATH.sqrt(number)
    
    RETURN format(Result)

END FUNCTION
```
