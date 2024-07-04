package vins.lambda.assignments;

public class AssignmentOne {

    public static void main(String[] args) {
        int add = calculate((value1, value2) -> value1 + value1, 20, 8);
        int subtract = calculate((val1, val2) -> val1 - val2, 20, 8);
        int multiply = calculate((val1, val2) -> val1 * val2, 20, 8);
        int division = calculate((val1, val2) -> val1 / val2, 24, 8);
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(division);
    }

   /* public static int add(MathOperation mathOperation) {
        return mathOperation.operate(10, 20);
    }*/

    public static int calculate(MathOperation mathOperation, int a, int b) {
        return mathOperation.operate(a, b);
    }
/*

    private int multiply(MathOperation mathOperation, int a, int b) {
        return mathOperation.operate(a, b);
    }

    private int devicde(MathOperation mathOperation, int a, int b) {


    }*/

}
