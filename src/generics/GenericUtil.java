package generics;

public class GenericUtil {

    public static <K,V> boolean compare(Pair<K,V> pairOne, Pair<K,V> pairTwo){
        return (pairOne.getKey().equals(pairTwo.getKey()) &&
                pairOne.getValue().equals(pairTwo.getValue()));
    }

}
