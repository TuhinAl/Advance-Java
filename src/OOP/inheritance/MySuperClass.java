package OOP.inheritance;

public class MySuperClass {

    private int variableOne = 10;
    private int variableTwo = 20;
    String testVariableOne  = "25";
    int testVariableTwo     = 35;
    final int finalVariable = 50;
    static int staticVar    = 100;

    public MySuperClass() {
    }

    public MySuperClass(int variableOne, int variableTwo) {
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public MySuperClass(String testVariableOne, int testVariableTwo) {
        this.testVariableOne = testVariableOne;
        this.testVariableTwo = testVariableTwo;
    }

    public String printSuperMethod(){
        return "print Super Method";
    }

    public int sum(int a, int b){
        System.out.print("Total Sum: ");
        return a+b;
    }

    public static String staticMethod(){
        return "This is static method from superclass";
    }
}
