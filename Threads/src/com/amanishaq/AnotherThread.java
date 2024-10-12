package com.amanishaq;

import static com.amanishaq.ThreadColour.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try{
            Thread.sleep(3000); // Thread put to sleep.
        } catch(InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return; // return statement immediately terminates thread.
            // Only executes if another thread wakes up this thread.
        }
        // After three seconds elapsed, message prints to console.
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
