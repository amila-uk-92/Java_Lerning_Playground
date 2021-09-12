package test.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String args[]) {
        String name = "";

        Optional.ofNullable(name).ifPresent(x -> System.out.println(x.concat(" x")));

        System.out.println(name.concat(" x"));
    }
}
