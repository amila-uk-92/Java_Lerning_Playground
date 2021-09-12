package test.thread;

class RunnableTest implements Runnable{

    static {
        System.out.println("static");
    }

    int x;
    public RunnableTest(int x){
        this.x = x;
    }

    public void run(){
        System.out.println("thread is running : " + this.x);
    }
    public static void main(String args[]){
        for (int i = 0; i < 10; i++) {
            RunnableTest t1=new RunnableTest(i);
            Thread T =new Thread(t1);
            T.start();

        }
    }
}
