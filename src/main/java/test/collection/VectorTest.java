package test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String args[]) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        vector.forEach(x-> System.out.println(x));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        List syncedList = Collections.synchronizedList(list);

        syncedList.forEach(y -> System.out.println(y));
    }
}
