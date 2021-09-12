package test.design.patern;

public class Factory {
    public static void main(String args[]) {
        test t = new test();
        Car y = t.getCar("bmw");
        y.print();
    }
}

class test{
    public Car getCar(String x){
        switch (x){
            case "bmw":
                return new bmw();
            case "ford":
                return new ford();
            default:
                return null;
        }
    }
}

interface Car{
    public void print();
}

class bmw implements Car{
    @Override
    public void print() {
        System.out.println("BMW");
    }
}

class ford implements Car{

    @Override
    public void print() {
        System.out.println("ford");
    }
}