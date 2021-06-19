package basic.interfaceAndClass;

public class TransportSystem implements Car, Plane{

    @Override
    public void run() {
        System.out.println("Car: I am running on the road as public/private transport ");

    }


    @Override
    public void fly() {
        System.out.println("as a Plane I need to fly");
    }

    @Override
    public void needOcten() {
        System.out.println("Car: i need some Octen to run");

    }
}
