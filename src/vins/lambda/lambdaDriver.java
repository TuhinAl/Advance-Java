package vins.lambda;

public class lambdaDriver {
    public static void main(String[] args) {
        System.out.println("Execution started...");
//        receiveNumber(getNumber());
        test(t -> {
            System.out.println("Hello test..!");
            return "TEST " + t.toUpperCase();
        });
        System.out.println("Execution ended...");
    }

    private static int getNumber() {
        System.out.println("Inside get Number");
        return 5;
    }

    private static void receiveNumber(int i) {
        System.out.println("Received Number is: " + i);
    }

    private static void test(Greetings greetings) {
        System.out.println("Received Greetings Service");
    }
}
