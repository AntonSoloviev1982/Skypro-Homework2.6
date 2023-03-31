package pro.sky.skyprohomework2_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Задание 1:
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание 1:");
        nums.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));
        System.out.println("_________________________________");

        //Задание 2:
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание 2:");
        nums2.stream().filter(x -> x % 2 == 0).distinct().sorted().forEach(x -> System.out.println(x));
        System.out.println("_________________________________");

        //Задание 3:
        List<String> words = new ArrayList<>(List.of("privet", "poka", "kak dela", "ok", "poka", "privet", "ok"));
        System.out.println("Задание 3:");
        words.stream().distinct().forEach(x -> System.out.println(x));
        System.out.println("_________________________________");

        //Задание 4:
        List<String> words2 = new ArrayList<>(List.of("privet", "poka", "kak dela", "ok", "poka", "privet", "ok"));
        System.out.println("Задание 4:");
        Map<String, Long> resultMap = words2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (Map.Entry<String, Long> entry : resultMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("_________________________________");

    }
}
