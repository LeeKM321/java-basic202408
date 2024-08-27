package etc.stream.quiz;

import util.Utility;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import static util.Utility.*;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> tr2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        tr2021.forEach(System.out::println);


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        makeLine();
//        List<String> cities = transactions.stream()
//                .map(trs -> trs.getTrader().getCity())
//                .distinct()
//                .collect(Collectors.toList());
        Set<String> cities = transactions.stream()
                .map(trs -> trs.getTrader().getCity())
                .collect(toSet());

        System.out.println(cities);


        // 연습 3: Cambridge에 근무하는 모든 거래자(Trader)를 찾아
        // 거래자 리스트로 이름순으로 오름차 정렬.
        makeLine();
        List<Trader> traders = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .collect(toList());

        traders.forEach(System.out::println);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서
        // 알파벳순으로 오름차 정렬하여 반환
        makeLine();
        List<String> nameList = transactions.stream()
                .map(trs -> trs.getTrader().getName())
                .distinct()
//                .sorted(Comparator.reverseOrder()) -> 내림차
                .sorted() // map 한 결과가 문자열 리스트.
                .collect(toList());
        System.out.println(nameList);

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        makeLine();
        boolean flag1 = transactions.stream()
                .anyMatch(trs -> trs.getTrader().getCity().equals("Milan"));

        System.out.println("flag1 = " + flag1);

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        makeLine();
        int totalValue = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("totalValue = " + totalValue);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        makeLine();
        int max = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();
        System.out.println("'max' = " + max);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        makeLine();
        int min = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();
        System.out.println("min = " + min);

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고,
        // 해당 거래의 정보를 출력하시오.
        makeLine();
        transactions.stream()
                .filter(trs -> trs.getValue() >= 500)
                .collect(toList())
                .forEach(System.out::println);

        // 연습 10. 모든 거래에서 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        makeLine();
//        int min = transactions.stream()
//                .mapToInt(Transaction::getValue)
//                .min()
//                .getAsInt();

        double average = transactions.stream()
                .filter(trs -> trs.getValue() > min)
                .mapToInt(Transaction::getValue)
                .average()
                .getAsDouble();

        System.out.println("average = " + average);


        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래정보들을 연도별로 그룹화하여 출력하세요.
        /*
        Year: 2021
        {Trader: Brian in Cambridge, year: 2021, value: 300}
        {Trader: Raoul in Cambridge, year: 2021, value: 400}
        ...

        Year: 2022
        {Trader: Raoul in Cambridge, year: 2022, value: 1000}
        ...


        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .collect(toList());

        List<Transaction> trs2022 = transactions.stream()
                .filter(trs -> trs.getYear() == 2022)
                .collect(toList());

        groupByYearMap.put(2021, trs2021);
        groupByYearMap.put(2022, trs2022);

        makeLine();
        for (Integer year : groupByYearMap.keySet()) {
            System.out.println("year = " + year);
            List<Transaction> list = groupByYearMap.get(year);
            list.forEach(System.out::println);
        }
        */

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(Transaction::getYear));

        makeLine();
        cambridgeTrsMap.forEach((key, value) -> {
            System.out.println("year = " + key);
            value.forEach(System.out::println);
        });


    }
}















