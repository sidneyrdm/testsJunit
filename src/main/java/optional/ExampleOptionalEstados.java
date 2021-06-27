package optional;

import java.util.Optional;

public class ExampleOptionalEstados {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor optional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor optional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = Não está presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor optional que está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = Não está presente"));

        Optional<String> optionalNullError = Optional.of(null);

        System.out.println("Valor optional que lança erro NullPointerException");
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Não está presente"));


    }
}
