package Edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EduStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("김밥");
        list.add("소고기");
        list.add("백반");
        list.add("소고기불고기");

        // List 스트림 생성
        Stream<String> stream = list.stream();
        stream.filter(str -> str.startsWith("소고기"))
                .forEach(System.out::println);

        // 배열
        int[] arr = {5, 4, 7, 1, 2, 3, 3 ,3};
        // 인트 배열로 스트림 생성
        IntStream intStream = Arrays.stream(arr);
        intStream.sorted()
                .distinct()
                .forEach(System.out::println);

        // 인트 배열로 스트림 생성
        IntStream intSteam = Arrays.stream(arr);
    }
}
