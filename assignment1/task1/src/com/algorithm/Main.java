package com.algorithm;

public class Main {

    public static void main(String[] args) {
        // Create 4 threads and start them in parallel
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");
        Thread thread4 = new Thread(new MyRunnable(), "Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Code to be executed by each thread
            System.out.println(Thread.currentThread().getName() + " is running.");
        }
    }
}
