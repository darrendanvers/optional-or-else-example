package dev.codestijl.example.optional;

import java.util.Optional;

/**
 * Demonstrates why you should use orElseGet rather than orElse on an Optional
 * when you will be calling a function to provide the value to use when the Optional
 * is empty.
 *
 * @author darren
 */
public class OptionalOrElseExample {

    public static void main(String[] args) {

        Optional<String> optionalWithValue = Optional.of("HAS VALUE");
        Optional<String> emptyOptional = Optional.empty();

        // This will call generateNewString() even though the orElse is not needed.
        System.out.println("**** Calling orElse() on Optional with value ****");
        System.out.println(optionalWithValue.orElse(generateNewString()));
        System.out.println();

        // This will call generateNewString() and that is the value returned because the Optional is empty.
        System.out.println("**** Calling orElse() on empty Optional ****");
        System.out.println(emptyOptional.orElse(generateNewString()));
        System.out.println();

        // This will return the value held in optionalWithValue and will not call generateNewString().
        System.out.println("**** Calling orElseGet() on Optional with value ****");
        System.out.println(optionalWithValue.orElseGet(OptionalOrElseExample::generateNewString));
        System.out.println();

        // This will call generateNewString() because the emptyOptional is empty.
        System.out.println("**** Calling orElseGet() on empty Optional ****");
        System.out.println(emptyOptional.orElseGet(OptionalOrElseExample::generateNewString));
    }

    private static String generateNewString() {
        System.out.println("--> Inside the function that generates a new String.");
        return "GENERATED NEW STRING";
    }
}
