package basic;

public class AnonymousClass {

    public interface HelloWorld{
         void greetings();
         void greetingsSomeone(String name);
    }

    public void sayHello() {
        class EnglishGreetings implements HelloWorld{
            String neme = "Alice";

            @Override
            public void greetings() {
                greetingsSomeone( neme);
            }

            @Override
            public void greetingsSomeone(String name) {
                System.out.println("Hello :" + name);
            }
        }


        HelloWorld englishGreetings = new EnglishGreetings();

        HelloWorld frenchGreetings = new HelloWorld() {

            String name = "FrenchMan";
            @Override
            public void greetings() {
                greetingsSomeone(name);

            }

            @Override
            public void greetingsSomeone(String name) {
                System.out.println("Hello: "+name +"!!");
            }
        };

        HelloWorld spanishGreetings = new HelloWorld() {

            String name = "SpanishMan";
            @Override
            public void greetings() {
                greetingsSomeone(name);

            }

            @Override
            public void greetingsSomeone(String name) {
                System.out.println("Hello: "+name +"!!");
            }
        };

        englishGreetings.greetings();
        englishGreetings.greetingsSomeone("Nelson");
        frenchGreetings.greetingsSomeone("Tuhin");
        frenchGreetings.greetings();
        spanishGreetings.greetings();
        spanishGreetings.greetingsSomeone("Jamal");


    }

    public static void main(String[] args) {
        AnonymousClass myApp = new AnonymousClass();
        myApp.sayHello();

    }
}
