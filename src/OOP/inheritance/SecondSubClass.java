package OOP.inheritance;

public class SecondSubClass extends MySubClass {

    public String printSuperMethod(){
        return "print Second Sub Method";
    }

    public int sum(int a, int b){
        System.out.print("Total Product: ");
        return a*b;
    }
}
