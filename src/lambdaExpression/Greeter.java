package lambdaExpression;

public class Greeter {

    public void greet( Greeting greeting){
        //System.out.println("Hello World!");
        greeting.perform();
    }

    public static void main(String [] arguments){
        Greeter greeter = new Greeter();
        HelloWorldGreetings greetings = new HelloWorldGreetings();
        greeter.greet(greetings);
    }
}
