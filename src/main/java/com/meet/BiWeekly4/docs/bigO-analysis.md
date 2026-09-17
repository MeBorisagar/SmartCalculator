## Big O Analysis


### Block X: Nested Loops

Time Complexity: $O(n^2)$

The outer loop executes n times. For every iteration of the outer loop, the inner loop executes n times. The inner body runs for  total  $n^2$ times.

Effect of doubling : 4 times more operations are needed.



### Block Y: Logarithmic 

Time Complexity: $O(\log n)$

Starting at n /2, the value of mid is halved on every iteration of the while loop until it reaches 0. Repeated division by 2 yields a logarithmic number of steps, specifically $log_2$n.

Effect of doubling : Doubling n adds exactly 1 extra operation.


### Block Z: Single Loop Iteration

Time Complexity: O(n)

The loop runs from i = 0 to n - 1, executing the print statement exactly n times. Array index access arr[i] takes $O(1)$ constant time.

Effect of doubling : 2 times more operations are needed.