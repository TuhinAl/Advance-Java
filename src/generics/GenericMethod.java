package generics;

public class GenericMethod<T> {

    public static <T>boolean isEquals(GenericType<T> t1, GenericType<T> t2){
        return t1.getT().equals(t2.getT());
    }

    public static void main(String [] args){
        GenericMethod<String> var1 = new GenericMethod<>();
       // var1
    }

}
