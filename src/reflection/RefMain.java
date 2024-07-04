package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class RefMain {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<Eagle> eagleClass = Eagle.class;
//        Class<?> eagleClass = Class.forName("Eagle");
        Method[] methods = eagleClass.getMethods();
        for (Method method : methods) {
            System.out.println("******Method Name: "+method.getName());
            System.out.println("******Return Type: "+method.getReturnType());
            System.out.println("******Parameters: "+ Arrays.toString(method.getParameters()));
        }
       /* System.out.println("Name: "+eagleClass.getName());
        System.out.println("Modifier: "+Modifier.toString(eagleClass.getModifiers()));
        System.out.println("Declared Fields: "+Arrays.stream(eagleClass.getFields()));*/

    }
}
