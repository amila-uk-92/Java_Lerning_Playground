package test.thread.concurrent;

public class T2 extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            ConcurrentTest.vec.add(i);
            System.out.println("Working on : " + Thread.currentThread().getName());
            ConcurrentTest.size = ConcurrentTest.vec.size();
            System.out.println("size of the vec: " + ConcurrentTest.size);
        }
    }

}
