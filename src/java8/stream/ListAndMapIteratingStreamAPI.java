package java8.stream;

import java.util.*;
import java.util.function.Supplier;

/**
 * @author Alauddin Tuhin
 * @created_on 2/27/21 at 10:41 AM
 * @project java practice
 **/
public class ListAndMapIteratingStreamAPI {
    public static void main(String[] args) {
        // ******List Iteration using Stream
        List<String> clubList = new ArrayList<>();
        clubList.add("Real Madrid");
        clubList.add("Barcelona");
        clubList.add("Arsenal");
        clubList.add("Liverpool");
        clubList.add("Manchester United");
        clubList.add("PSG");

        Supplier<String> supplier = () -> "Invalid";


        clubList.stream()
                .filter(p->p.startsWith("R") || p.startsWith("M"))
                .forEach(p-> System.out.println(p));


        // MAP iterator
        Map<Integer, String> clubMap = new HashMap<>();
        clubMap.put(1, "Bayern Munich");
        clubMap.put(2, "Real Madrid");
        clubMap.put(5,"PSG");
        clubMap.put(3, "Barcelona");
        clubMap.put(4, "Arsenal");


        //clubMap.forEach((key,value)-> System.out.println(key +": "+value));
        clubMap.entrySet()
                .stream()
                .filter(p -> p.getValue().equals("Barcelona"))
                .forEach(System.out::println);


        List<Integer> teamRankList = new ArrayList<>(clubMap.keySet());
        List<String> teamNameList = new ArrayList<>(clubMap.values());
        teamRankList.forEach(System.out::println);
        teamNameList.forEach(System.out::println);
    }

}
