package OOP.polymorphism;

import OOP.inheritance.MySuperClass;

public abstract class Person {

    private String firstName;
    private String lastName;

    public Person() {
        MySuperClass superClass = new MySuperClass();
        superClass.printSuperMethod();
    }

    /*
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }*/

    public abstract void work();
    public abstract int sum(int a, int b);
    public void changeName(String newName){
        this.firstName =newName;
    }




    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
