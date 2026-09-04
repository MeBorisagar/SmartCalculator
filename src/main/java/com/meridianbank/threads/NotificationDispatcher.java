package com.meridianbank.threads;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationDispatcher implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(NotificationDispatcher.class);

    private final String accountId;
    private final String message;

    public NotificationDispatcher(String accountId, String message) {
        this.accountId = accountId;
        this.message = message;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        log.info( "{} | Dispatching to {}",threadName , accountId);

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        log.info("{} | Sent: {}",threadName , message);
    }
}