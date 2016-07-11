# MutiThreadSummary
Give examples to show how to achieve mutithread.
Documents:
(1)mutithread: extends Thread(a class)to achieve mutithread.
(2)mutithread2: implements Runnable to achieve mutithread.
(3)Examples to explain static proxy and the use of Runnable.

Summary:
(1) extends Thread+override run()
Use: Create subclass object, then object.start()
(2)implements Runnable, override run()
Use: *Create real role
     *Create proxy role(here is Thread)+reference
     *proxyrole.start()

Recommand: Use Runnable
(1) void single inheritance of Thread(class)
(2) can share resource.



