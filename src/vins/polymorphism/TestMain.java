package vins.polymorphism;

import vins.lambda.Greetings;

public class TestMain {
    public static void main(String[] args) {
        Greetings greet = String::toUpperCase;
        test(greet);
    }

    public static void test(Greetings greetings) {
        String countryName = greetings.greet("Bangladesh");
        System.out.println(countryName);

    }
}
