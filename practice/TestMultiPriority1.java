
package practice;

import java.lang.Thread;

class TestMultiPriority1 extends Thread {

    public void run() {
        try {
            Thread.sleep(Thread.currentThread().getId() - 10 % 10);
            System.out.println("running thread ID is:" + Thread.currentThread().getId() + " running thread name is:"
                    + Thread.currentThread().getName() + " running thread priority is:"
                    + Thread.currentThread().getPriority());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String args[]) {
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        // TestMultiPriority1 m3 = new TestMultiPriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        // m3.setPriority(Thread.NORM_PRIORITY);
        m1.start();
        m2.start();
        // m3.start();
    }
}
