package lambdaExpression;

public interface Calculator {

    double calculateDiv(int a, int b);
}

 class CalculatorImpl implements Calculator{

    Calculator calculator = (int a, int b) -> {

                    if( b == 0)
            return 1;
        else

         return a/b;
     }

   /* @Override
    public double calculateDiv(int a, int b) {
        return 0;
    }*/
     ()
}
