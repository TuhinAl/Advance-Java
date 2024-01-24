package java8.stream;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("aaa");
        stringJoiner.add("bbb");
        stringJoiner.add("ccc");
        String string = stringJoiner.toString();
        System.out.println(string);
        String result = String.join("-", "2015", "10", "31" );
    }
}
