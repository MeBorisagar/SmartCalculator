## Part A 

### What is the expected output of `TransferDemo` code?

The exact ordering of the thread output is non-deterministic because threads t1 and t2 are running concurrently.

The only guaranteed ordering is that `Main | Before start` is first and `Main | After join` is last, with each worker's `STARTED` appearing before its corresponding `DONE`.

