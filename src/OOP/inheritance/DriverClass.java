package OOP.inheritance;
public class DriverClass {
    public static void main(String [] arguments){

        MySuperClass mySuperClass    = new MySuperClass();
        MySubClass   mySubClass      = new MySubClass();
       // MySubClass   mySubClass1     = new MySuperClass();
        MySuperClass mySuperClass1   = new MySubClass();
        SecondSubClass secondSubClass = new SecondSubClass();
        MySubClass mySubClass1 = new SecondSubClass();

        System.out.println(mySuperClass.finalVariable);
        System.out.println(mySuperClass.sum(5,7));
        System.out.println(mySubClass.printSuperMethod());
        System.out.println(mySubClass.testVariableOne);
        System.out.println(mySubClass.testVariableTwo);

        System.out.println("==================####===============");
        System.out.println(mySubClass.sum(24,26));
        System.out.println(mySubClass.testVariableOne);
        System.out.println(mySubClass.testVariableTwo);
        System.out.println(mySubClass.printSuperMethod());
        System.out.println(mySubClass.finalVariable);

        System.out.println("==================####===============");
        System.out.println(mySuperClass1.sum(10,12));
        System.out.println(mySuperClass1.finalVariable);
        System.out.println(mySuperClass1.testVariableOne);
        System.out.println(mySuperClass1.testVariableTwo);
        System.out.println(mySuperClass1.printSuperMethod());

        System.out.println("==================####===============");
        System.out.println(mySubClass1.printSuperMethod());

    }
}

