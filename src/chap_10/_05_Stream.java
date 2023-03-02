package chap_10;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림
        int[] scores = {100,95,90,85,80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c","c++","c#"};
        Stream<String> stream = Arrays.stream(langs);

        List<String> langlist = new ArrayList<>();
        langlist = Arrays.asList("python", "java", "javascript", "c","c++","c#");

        System.out.println(langlist.size());

        Stream<String> langlistStream = langlist.stream();

        Stream<String> langListOfStream = Stream.of("py","ja","c","c++");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum,

        // 90점 이상만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x-> System.out.println(x));
        System.out.println("-----");
        //Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

        // 90점 이상 카운팅
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);

        // 90점 이상 점수 합
        int sum = Arrays.stream(scores).filter(x->x>=90).sum();
        System.out.println(sum);
        System.out.println("----");
        // 90점 이상 점수 정렬 출력
        Arrays.stream(scores).filter(x->x>=90).sorted().forEach(System.out::println);

        // "python", "java", "javascript", "c","c++","c#"
        System.out.println("----");
        Arrays.stream(langs).filter(x->x.startsWith("c")).forEach(System.out::println);
        System.out.println("----");
        Arrays.stream(langs).filter(x->x.startsWith("java")).forEach(System.out::println);
        System.out.println("----");
        langlist.stream().filter(x->x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("----");
        langlist.stream().filter(x->x.length() <= 4).filter(x->x.contains("c")).forEach(System.out::println);
        System.out.println("----");

        boolean anyMatch = langlist.stream().filter(x->x.length() <= 4).anyMatch(x->x.contains("c"));
        System.out.println(anyMatch);

        System.out.println("----");
        boolean allMatch = langlist.stream()
                .filter(x->x.length() <= 4)
                .allMatch(x->x.contains("c"));
        System.out.println(allMatch);

        langlist.stream().filter(x->x.length()<=4)
                .filter(x->x.contains("c"))
                .map(x->x+" 어려워요")
                .forEach(System.out::println);

        langlist.stream().filter(x->x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("----");

        List<String> ls = langlist.stream().filter(x->x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        for(String s : ls)
            System.out.println(s);




    }
}
