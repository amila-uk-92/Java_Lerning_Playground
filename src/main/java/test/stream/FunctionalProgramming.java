package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FunctionalProgramming {

    public static void main(String args[]){

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(21);
        list.add(13);
        list.add(6);
        list.add(10);
        list.add(8);
        list.add(8);
        list.add(89);

        Set x = printnumbers(list);
        System.out.println();
    }

    private static void print(Integer number){
        System.out.println(String.format("Number is : %d", number));
    }

    private static Set printnumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(x->{
                    return x%2 == 0;
                })
                .map(y -> y * y )
                .collect(Collectors.toSet());
    }
}