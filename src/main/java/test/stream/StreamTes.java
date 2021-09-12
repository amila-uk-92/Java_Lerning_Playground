package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTes {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();

        list.stream().filter(x -> {
            return x.isEmpty();
        })
                .map(y -> y)
                .collect(Collectors.toSet());
    }
}