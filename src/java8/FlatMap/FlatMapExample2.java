package java8.FlatMap;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {


    // create dummy records
    private static List<Order> findAll() {

        LineItem item1 = new LineItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
        LineItem item2 = new LineItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
        Order order1 = new Order(1, "A0000001", Arrays.asList(item1, item2), new BigDecimal("2.20"));

        LineItem item3 = new LineItem(3, "monitor BenQ", 5, new BigDecimal("99.00"), new BigDecimal("495.00"));
        LineItem item4 = new LineItem(4, "monitor LG", 10, new BigDecimal("120.00"), new BigDecimal("1200.00"));
        Order order2 = new Order(2, "A0000002", Arrays.asList(item3, item4), new BigDecimal("1695.00"));

        LineItem item5 = new LineItem(5, "One Plus 8T", 3, new BigDecimal("499.00"), new BigDecimal("1497.00"));
        Order order3 = new Order(3, "A0000003", Arrays.asList(item5), new BigDecimal("1497.00"));

        return Arrays.asList(order1, order2, order3);

    }

    public static void main(String[] args) {
        List<Order> orders = findAll();

        //list of item names in asc order

        List<String> stringList = orders
                .stream()
                .flatMap(x -> x.getLineItems().stream())
                .map(x -> x.getItem())
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

//        stringList.stream().forEach( e -> System.out.println(e));

        // list of price
        List<BigDecimal> priceList = orders
                .stream()
                .flatMap(e -> e.getLineItems().stream())
                .map(e -> e.getTotal())
                .collect(Collectors.toList());
//        priceList.stream().forEach( e -> System.out.println(e));
        BigDecimal totalSumOfTotal = priceList.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal totalSum = orders.stream().map(x -> x.getTotal()).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(totalSumOfTotal);
        System.out.println(totalSum);
        // total sum of price



    }
}
