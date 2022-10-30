package test.thread.concurrent;

public class T3 extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            if( ConcurrentTest.vec.size() > 0 ) ConcurrentTest.vec.remove(0);
            System.out.println("Working on : " + Thread.currentThread().getName());
            ConcurrentTest.size = ConcurrentTest.vec.size();
            System.out.println("size of the vec: " + ConcurrentTest.size);
        }
    }

}
