package basic;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterClass {

    interface checkPerson {
        boolean test(Person person);
    }

    //Approach-1

    public static void printPersonOlderThan(List<Person> person, int age) {
        for (Person obj : person) {
            if (obj.getAge() >= age) {
                obj.printPerson();
            }
        }
    }


    //Approach-2

    public static void printPersonAgeRange(List<Person> person, int low, int high) {

        for (Person obj : person) {
            if (obj.getAge() > low && high > obj.getAge()) {
                obj.printPerson();
            }
        }
    }

    //Approach-3,4,5

    public static void printPerson(List<Person> person, checkPerson tester) {

        for (Person obj : person) {
            if (tester.test(obj)) {
                obj.printPerson();

            }
        }
    }

    //Approach-6

    public static void printPersonWithPredicate(List<Person> person, Predicate<Person> tester) {

        for (Person obj : person) {
            if (tester.test(obj)) {
                obj.printPerson();

            }
        }
    }


    //Approach-7

    public static void processPerson(List<Person> person, Predicate<Person> tester,
                                     Consumer<Person> block) {

        for (Person obj : person) {
            if (tester.test(obj)) {
                block.accept(obj);

            }
        }
    }

    //Approach-7

    public static void processPersonWithFunction(List<Person> person, Predicate<Person> tester,
                                                 Function<Person, String> mapper, Consumer<Person> block) {

        for (Person obj : person) {
            if (tester.test(obj)) {
                String data = mapper.apply(obj);
                block.accept(obj);

            }
        }
    }

    public static void main(String... args) {
        List<Person> roster = Person.createRoster();

        for (Person p : roster) {
            p.printPerson();
        }
        System.out.println("Persons older than 20:");
        printPersonOlderThan(roster, 25);

        System.out.println("Persons between the ages of 14 and 30:");
        printPersonAgeRange(roster, 18, 23);
        System.out.println();

        System.out.println("Persons who are eligible for Selective Service:");
        class checkPersonEligibleForSelectiveService implements checkPerson {
            @Override
            public boolean test(Person person) {
                return person.getGender() == Person.GENDER.MALE && person.getAge() >= 18 &&
                        person.getAge() <= 25;
            }
        }

        printPerson(roster, new checkPersonEligibleForSelectiveService());
        System.out.println();

        // Approach 4: Specify Search Criteria Code in an Anonymous Class
        System.out.println("Persons who are eligible for Selective Service " +
                "(anonymous class):");

        printPerson(roster, new checkPerson() {
            @Override
            public boolean test(Person person) {
                return person.getGender() == Person.GENDER.MALE && person.getAge() >= 18 &&
                        person.getAge() <= 25;
            }

        });

        System.out.println();

        // Approach 5: Specify Search Criteria Code with a Lambda Expression

        System.out.println("Persons who are eligible for Selective Service " +
                "(lambda expression):");
        printPerson(roster,
                (Person person) ->
                        person.getGender() == Person.GENDER.MALE && person.getAge() >= 18 &&
                                person.getAge() <= 25
        );

        System.out.println();

        printPersonWithPredicate(roster,
                p -> p.getGender() == Person.GENDER.MALE && p.getAge() >= 19 &&
                        p.getAge() <= 26);

        System.out.println();

        processPerson(roster, p -> p.getGender() == Person.GENDER.MALE && p.getAge() >= 19 &&
                        p.getAge() <= 26,
                p -> p.printPerson());


        System.out.println();

        // Approach 7, second example
        processPersonWithFunction(roster, p -> p.getGender() == Person.GENDER.MALE && p.getAge() >= 19 &&
                        p.getAge() <= 26,
                p -> p.getEmail(),   // why not work ' p -> p.printPerson()'
                email -> System.out.println(email));



        System.out.println();
        System.out.println("Persons who are eligible for Selective Service " +
                "(with bulk data operations):");

        roster.stream().filter(p -> p.getGender() == Person.GENDER.MALE && p.getAge() >= 19 &&
                p.getAge() <= 26).map(p -> p.getEmail())
                .forEach(email -> System.out.println(email));



    }

}

