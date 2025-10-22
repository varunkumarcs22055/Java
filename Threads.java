// class A implements Runnable {
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Hii");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Counter{
    int count = 0;
    synchronized void increment(){
        count++;
    }

}

public class Threads {
    public static void main(String[] args) {
        // What is a thread?
        // A thread is a lightweight subprocess, the smallest unit of processing that can be scheduled by an operating system.
        // Threads are independent, so if there is an exception in one thread, it does not affect the other threads.
        // Multithreading is a Java feature that allows concurrent execution of two or more threads for maximum utilization of CPU.
        // Thread class and Runnable interface are used to create threads in Java.
        // There are two ways to create a thread:
        // 1. By extending the Thread class
        // 2. By implementing the Runnable interface

        // A objA = new A();
        // B objB = new B();
        // It doesn't work this way with Runnable interface we have to use Thread class to wrap Runnable objects
        // objA.start();
        // objB.start();
        // Thread t1 = new Thread(objA);
        // Thread t2 = new Thread(objB);
        // t1.start();
        // t2.start();
        // System.out.println(objA.getPriority());
        // objA.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(objA.getPriority());

        // BY lambda expression
        Runnable objA = () -> {
            for(int i=0;i<5;i++){
                System.out.println("Hii");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable objB = () -> {
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start();
        t2.start();

        Counter counter = new Counter();
        Thread t3 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });
        Thread t4 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });
        t3.start();
        t4.start();
        try {
            t3.join(); // Ensure t3 completes before printing the count
            t4.join(); // Ensure t4 completes before printing the count
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter.count);
    }
}
