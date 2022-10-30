package test.thread.concurrent;

import java.util.Vector;

public class ConcurrentTest {

    static Vector<Integer> vec = new Vector<>();
    static volatile int size = 0;

    public static void main(String args[]){

        Thread t1 = new Thread(new T1());
        t1.start();

        Thread t2 = new T2();
        t2.start();

        Thread t3 = new T3();
        t3.start();

//        for (int i = 0; i < 10; i++) {
//            ConcurrentTest.size = ConcurrentTest.vec.size();
//            System.out.println("size of the vec: " + size);
//        }


    }
}
