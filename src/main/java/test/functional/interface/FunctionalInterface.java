package test.functionalinterface;

@FunctionalInterface
interface functionalInt{
    public void print();

    default void print1(){
        System.out.println("default function");
    }

    public static void print3(){
        System.out.println("public static method");
    }
}

@FunctionalInterface
interface functionalInt2{
    public void print();
}

@FunctionalInterface
interface Calc{
    void add(int a, int b);
}

class FunctionalTest implements functionalInt {
    public static void main(String args[]) {
        FunctionalTest functionalTest = new FunctionalTest();
        functionalTest.print();
        functionalTest.print1();
        functionalInt.print3();

        // implementing functional interface with lamda
        functionalInt2 functionalInt2 = () -> System.out.println("Implementation of functional interface");
        functionalInt2.print();

        Calc calc = (x, y) -> {
            System.out.println(x + y);
        };
        calc.add(2, 5);
    }

    @Override
    public void print() {
        System.out.println("Functional Interface Test");
    }
}
