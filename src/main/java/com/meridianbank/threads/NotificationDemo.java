package com.meridianbank.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationDemo {

    private static final Logger log = LoggerFactory.getLogger(NotificationDemo.class);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new NotificationDispatcher("ACC001", "Payment received"), "NotificationWorker-1");

        Thread t2 = new Thread(new NotificationDispatcher("ACC002", "Payment received"), "NotificationWorker-2");

        Thread t3 = new Thread(new NotificationDispatcher("ACC003", "Payment received"), "NotificationWorker-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        log.info("All notifications dispatched.");
    }
}