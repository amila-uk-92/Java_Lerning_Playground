package test.thread;

public class ThreadTest extends Thread{

    int x;
    public ThreadTest(int x){
        this.x = x;
    }

    public void run(){
        System.out.println("thread is running : " + this.x);
    }
    public static void main(String args[]){
        for (int i = 0; i < 10; i++) {
            ThreadTest t1=new ThreadTest(i);
            t1.start();
        }
    }
}
