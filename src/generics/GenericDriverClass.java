package generics;

public class GenericDriverClass <K,V>{
    public static void main(String [] args){

        TestPair<Integer,Integer> pairOne =  new OrderedPair<>(1000,10);
        TestPair<String,Integer> pairTwo  =  new OrderedPair<>("Tuhin", 153400008);

        //copy 'Pair' type
        Pair<Integer, Integer> pair_one =  new Pair<>(1000,10);
        Pair<String, Integer> pair_two  =  new Pair<>("Tuhin", 153400008);

        System.out.println(pairOne.getKey()+" " +pairOne.getValue() +" ");
        System.out.println(pairTwo.getKey() +" " +pairTwo.getValue());

        Pair<Integer, Integer> pair1 = new Pair<>(15,45);
        Pair<Integer ,Integer> pair2 = new Pair<>(95,45);

        System.out.println("Pair -1: "+pair1);
        System.out.println("Pair -1: "+pair2);
        System.out.println(GenericUtil.compare(pair1,pair2));
        //System.out.println(GenericUtil.compare(pair1, pair2));
        //System.out.println(GenericUtil.compare(pair_one, pair_two));
    }
}
