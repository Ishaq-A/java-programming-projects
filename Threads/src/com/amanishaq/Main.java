package com.amanishaq;

import static com.amanishaq.ThreadColour.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another thread ==");
        anotherThread.start();

        // Creating new thread using Anonymous Class:
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread.");
            }
        }.start();

        // Anonymous Class for myRunnableThread class.
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's " +
                        "implementation of run");

                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, " +
                            "so I'm running again");
                } catch(InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");

    }
}
