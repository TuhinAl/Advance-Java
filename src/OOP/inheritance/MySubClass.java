package OOP.inheritance;

public class MySubClass extends MySuperClass{

    private String subClassVar = "Sub Class";

    public MySubClass(int variableOne, int variableTwo) {
        super(variableOne, variableTwo);
    }

    public MySubClass(String testVariableOne, int testVariableTwo) {
        super(testVariableOne, testVariableTwo);
    }

    public MySubClass() {
    }


    public String printSuperMethod(){
        return "print Sub Method";
    }

    public int sum(int a, int b){
        System.out.print("Total Product: ");
        return a*b;
    }

    public static String staticMethod(){
        return "This is static method from Sub class";
    }
}
