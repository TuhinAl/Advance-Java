package reflection;

public class Eagle {
    public String breed;
    private boolean canSwim;

    public void fly() {
        System.out.println("Fly");
    }

    public void eat() {
        System.out.println("Eat");
    }


    @Deprecated
    private void sleep() {

    }

    public static void main(String[] args) {

    }
}

