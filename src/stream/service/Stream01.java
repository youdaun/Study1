package stream.service;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream01 {

    public static void main(String[] args) {
        // 1.filter()
        System.out.println("시작");
        String[] fruits1 = {"apple", "grape", "orange","", "banana", ""};
        String[] existed = {};

        existed = Arrays.stream(fruits1).filter(item -> isNotnull(item))
                        .toArray(String[]::new);

        // 2.distinct()
        /*String[] fruits2 = {"apple", "grape", "orange","grape", "banana", "banana"};
        List<String> distincted = new ArrayList<>();

        distincted = Arrays.asList(elements).stream().distinct().collect(Collectors.toList());
        distincted.forEach(System.out::println);*/

        // 3.map
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "Melon", "Grape", "strawberry"));

        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        //list.forEach(System.out::println);


    }

    private static boolean isNotnull(String item) {
        boolean result;
        if(!(item == "")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
