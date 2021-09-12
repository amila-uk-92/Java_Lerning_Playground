package test.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashTest {

    public static void main(String args[]){
        Emp emp1 = new Emp(1);
        Emp emp2 = new Emp(1);

        Map<Emp, String> empMap = new HashMap<>();
        empMap.put(emp1, "Amila");
        empMap.put(emp2, "Amila");
        empMap.put(null, "Amila");

        System.out.println(emp1.equals(emp2));
        System.out.println(empMap.entrySet());
        System.out.println(empMap.size());
    }
}

class Emp{
    int id;

    public Emp(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
