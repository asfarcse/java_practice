package optionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello, World!");

        if (optionalValue.isPresent()) {
            String value = optionalValue.get();
            System.out.println("Value: " + value);
        } else {
            System.out.println("No value present.");
        }

        Optional<String> emptyOptional = Optional.empty();

        if (emptyOptional.isPresent()) {
            System.out.println("This won't be printed because Optional is empty.");
        } else {
            System.out.println("Optional is empty.");
        }

        String orElseValue = emptyOptional.orElse("Default Value");
        System.out.println("Value with orElse: " + orElseValue);

        String nullableValue = null;
        Optional<String> nullableOptional = Optional.ofNullable(nullableValue);

        String orElseGetValue = nullableOptional.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value with orElseGet: " + orElseGetValue);

        Optional<String> transformedOptional = optionalValue.map(s -> s.toUpperCase());
        System.out.println("Transformed Value: " + transformedOptional.orElse("No value"));

        Optional<String> filteredOptional = optionalValue.filter(s -> s.contains("Hello"));
        System.out.println("Filtered Value: " + filteredOptional.orElse("No value"));
    }
}

