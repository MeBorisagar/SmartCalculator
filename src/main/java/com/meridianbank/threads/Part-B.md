## Part B

### B1. What is the state of t1 while it is inside Thread.sleep(100)?

Thread t1 will be in Waiting State : TIMED_WAITING inside Thread.sleep(100).

### B2.  Can 'Main | After join' print BEFORE both workers print 'DONE'? Explain in one sentence.

No. `join()` causes the main thread to wait until the corresponding worker thread has terminated, so both workers must print `DONE` before `Main | After join`.

###  B3.  A colleague suggests replacing t1.start() with t1.run(). What is the consequence? 

Calling `run()` directly does not create or start a new thread; the `run()` method executes on the current main thread.