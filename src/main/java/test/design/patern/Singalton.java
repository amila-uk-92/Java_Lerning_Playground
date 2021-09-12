package test.design.patern;

import java.lang.reflect.Constructor;

public class Singalton {

    private static Singalton instance;

    private Singalton(){

    }

    public static Singalton getInstance(){
        if(instance == null) return new Singalton();
        else return instance;
    }

}

class Test{

    public static void main(String args[]) {
        Singalton singaltonOrg = Singalton.getInstance();

        System.out.println("singaltonOrg : " + singaltonOrg.hashCode());

        //reflection.
        try {
            Class<?> singletonClass = Class.forName("Singalton");
            Constructor<?> constructor = singletonClass.getDeclaredConstructor();
            constructor.setAccessible(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Singalton singaltonDup = Singalton.getInstance();
        System.out.println("singaltonOrg : " + singaltonOrg.hashCode());
    }
}