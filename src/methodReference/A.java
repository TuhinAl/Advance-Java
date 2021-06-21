package methodReference;

import java.nio.file.DirectoryStream;

@FunctionalInterface
public interface A {

     //void getName(String name);
    boolean checkDigit(int a);
}

class Digit{
    static boolean isSingleDigit(int a) {
        return ((-10) < a && a < 10);
    }
}

 class Test{
     static void getInfo(String info) {
         System.out.println(info);
     }
     public static void main(String[] args) {

      /* A a = (name) -> System.out.println(name);
         a.getName("He id Bad");
         A a1 = Test::getInfo;
         a1.getName("getInfo is executing");*/

       A a =  p -> {return (-10) < p && p < 10;};
         System.out.println(a.checkDigit(9));
         A a2 = Digit::isSingleDigit;
         System.out.println(a2.checkDigit(2));

     }
}
