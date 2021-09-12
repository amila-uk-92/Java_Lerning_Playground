package test;

class OverrideTest {

    static void print(){
        System.out.println("Override class");
    }

}

class OverrideChiled extends OverrideTest{

    static void print(){
        System.out.println("OverrideChiled class");
    }

    public static void main(String args[]) {
        print();
    }
}