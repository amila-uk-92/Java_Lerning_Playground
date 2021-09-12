package test.gc;

public class GcTest {
    public static void main(String args[]) {

        GcTest gcTest = new GcTest();
        gcTest = null;

        Runtime.getRuntime().gc();
        //System.gc();

        System.out.println("main method");
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("finalize called");
    }
}
