package lambdaExpression;

public interface Calculator {

   abstract int calculateDiv(int a, int b);
}

 class CalculatorImpl{

    public static void main (String [] args){

        Calculator calculator = (a,b)-> a/b;
        System.out.println(calculator.calculateDiv(10,2));
    }
 }
