package test.string;

public class StringTes {

    public static void main(String args[]) {
        String str = new String("Amila");
        StringBuffer buffer = new StringBuffer("Amila");
        StringBuilder builder = new StringBuilder("Amila");

        str.concat(" Indrajith");
        buffer.append(" Indrajith");
        builder.append(" Indrajith");

        System.out.println(str);
        System.out.println(buffer);
        System.out.println(builder);
    }
}
