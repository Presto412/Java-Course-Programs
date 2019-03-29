package lab;

import java.util.*;
import java.lang.Thread;

class Counter {
    int count0 = 0, count1 = 0, count2 = 0;

    public synchronized void count(int[] votes) {
        for (int vote : votes) {
            if (vote == 1) {
                count0 += 1;
            } else if (vote == 2) {
                count1 += 1;
            } else {
                count2 += 1;
            }
        }
    }
}

class MultiThread extends Thread {
    protected Counter counter = null;
    int[] votes;

    MultiThread(int[] votes, Counter counter) {
        this.votes = votes;
        this.counter = counter;
    }

    public void run() {
        counter.count(votes);
    }
}

class MultiThreadingTest {
    public static void main(String[] args) {
        int arr[] = new int[240];
        for (int i = 0; i < 240; i++) {
            Random rn = new Random();
            int number = rn.nextInt(3) + 1;
            arr[i] = number;
        }
        Counter counter = new Counter();
        MultiThread t1 = new MultiThread(Arrays.copyOfRange(arr, 0, 60), counter);
        MultiThread t2 = new MultiThread(Arrays.copyOfRange(arr, 60, 120), counter);
        MultiThread t3 = new MultiThread(Arrays.copyOfRange(arr, 120, 180), counter);
        MultiThread t4 = new MultiThread(Arrays.copyOfRange(arr, 180, 240), counter);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
        System.out.println("A:" + counter.count0 + ",B:" + counter.count1 + ",C:" + counter.count2);
        if (counter.count0 > counter.count1 && counter.count0 > counter.count2) {
            System.out.println("A won");
        } else if (counter.count1 > counter.count0 && counter.count1 > counter.count2) {
            System.out.println("B won");
        } else {
            System.out.println("C won");
        }
        System.out.println("Total Votes:" + (counter.count0 + counter.count1 + counter.count2));
    }

}
