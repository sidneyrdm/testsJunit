package optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExampleOptionalPrimitivos {

    public static void main(String[] args) {
        System.out.println("Valor INTEIRO optional");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Valor DOUBLE optional");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("Valor LONG optional");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }
}
