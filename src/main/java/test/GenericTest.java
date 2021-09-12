package test;

import java.util.List;

public class GenericTest extends A{

    public static void main(String args[]) {
        print("Amila");
    }

    public static <T> void print(T name){
        System.out.println(name);
    }

    public static List<? super GenericTest> print1(){
        return null;
    }

    public static List<? extends A> print2(){
        return null;
    }
}

class A{

}
