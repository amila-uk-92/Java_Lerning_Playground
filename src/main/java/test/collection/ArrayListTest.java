package test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String args[]) {

//        1. Collections.synchronizedListzedList() method.
//        2. Using CopyOnWriteArrayList.

        List<Object> arrayList = Collections.synchronizedList(new ArrayList<>());

        synchronized (arrayList) {
            // must be in synchronized block
            Iterator it = arrayList.iterator();

            while (it.hasNext())
                System.out.println(it.next());
        }
    }
}
