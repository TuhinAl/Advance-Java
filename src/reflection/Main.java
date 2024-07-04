package reflection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static void printClassInfo(Class<?>... classes) {
        for (Class<?> data : classes) {
            System.out.println(String.format("class name %s, and package name %s",
                    data.getSimpleName(), data.getPackageName()));

            Class<?>[] interfaces = data.getInterfaces();

            for (Class<?> inter : interfaces) {
                System.out.println(String.format("class  %s, implements %s",
                        data.getSimpleName(), inter.getSimpleName()));


            }
        }
    }

    private static class Square implements Drawable {

        @Override
        public int getNUmberOfCorners() {
            return 4;
        }
    }

    private static interface Drawable {
        int getNUmberOfCorners();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> stringClass = String.class;
        Map<String, Integer> mapObject = new HashMap<>();
        Class<?> hashmapClass = mapObject.getClass();
        Class<?> squareClass = Class.forName("reflection.Main$Square");

        printClassInfo(stringClass, hashmapClass, squareClass);
    }


    public void test2() {

