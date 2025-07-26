package DesignPatterns.SingletonDesignPattern.LazyInitialization;

import java.util.concurrent.CountDownLatch;

public class TestSingleton {
    public static void main(String[] args) {
        // Latch with count 1 to release both threads at the same time
        CountDownLatch startSignal = new CountDownLatch(1);

        Thread thread1 = new Thread(() -> {
            try {
                startSignal.await(); // Wait for the signal
                Car instance = Car.getInstance();
                System.out.println("Thread 1: " + instance.hashCode());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                startSignal.await(); // Wait for the signal
                Car instance2 = Car.getInstance();
                System.out.println("Thread 2: " + instance2.hashCode());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start both threads (they'll wait at startSignal.await())
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(500); // Let threads reach await()
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread releasing latch...");
        startSignal.countDown(); // Now both threads proceed at same time
    }
}
