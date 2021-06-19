package basic;

import java.net.InetSocketAddress;
import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum GENDER {
        MALE, FEMALE
    }

    String name;
    String email;
    LocalDate date;
    GENDER gender;

    public Person(String name, String email, LocalDate date, GENDER gender) {
        this.name = name;
        this.email = email;
        this.date = date;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDate() {
        return date;
    }

    public GENDER getGender() {
        return gender;
    }


    public void printPerson() {
        System.out.println(name + " " + this.getAge());
    }

    public static int compareByAge(Person a, Person b) {
        return a.getDate().compareTo(b.getDate());
    }
    public int getAge() {
        return date.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    public static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();

        roster.add(new Person("Alauddin Tuhin", "tuhin@mail.com",
                IsoChronology.INSTANCE.date(1996, 10, 10), GENDER.MALE));

        roster.add(new Person("Nelson jamal", "jamal@mail.com", IsoChronology.INSTANCE
                .date(1995,6,5),GENDER.MALE));
        roster.add(new Person("John Doe", "doe@mail.com",
                IsoChronology.INSTANCE.date(1994, 10, 23), GENDER.MALE));

        roster.add(new Person("ALice kumar", "jamal@mail.com", IsoChronology.INSTANCE
                .date(1993,8,17),GENDER.MALE));
        roster.add(new Person("Hasan Safique", "jamal@mail.com", IsoChronology.INSTANCE
                .date(1995,11,19),GENDER.MALE));
        roster.add(new Person("Safikul Jaman", "safiqul@mail.com",
                IsoChronology.INSTANCE.date(1996, 10, 21), GENDER.MALE));

        roster.add(new Person("iqbal Reja", "reja@mail.com", IsoChronology.INSTANCE
                .date(1994,6,29),GENDER.MALE));

        return roster;
    }
}
