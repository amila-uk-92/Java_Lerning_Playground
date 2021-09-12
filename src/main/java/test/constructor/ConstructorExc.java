package test.constructor;

class ConstructorExc {

    public ConstructorExc(){
        this(1);
        System.out.println("no args");
    }

    public ConstructorExc(int x){
        System.out.println("args" + x);
    }

    public static void main(String args[]) {
        ConstructorExc constructorExc = new ConstructorExc();
    }
}
