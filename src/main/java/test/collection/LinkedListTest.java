package test.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Amila");
        list.add("Thushani");
        list.add("Nyun");

        System.out.println(list.pop());

        list.stream().forEach(item->{
            System.out.println(item);
        });

    }
}
