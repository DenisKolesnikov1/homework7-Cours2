package pro.sky.arraylist;

import ch.qos.logback.classic.util.LogbackMDCAdapter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, -1, 8, 2, -3, 4, 4, 5, 5, 6, 7);

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        Set<Integer> integers = new HashSet<>(nums);
        System.out.println(integers);
        for (Integer num : integers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();



        Set<Integer> integers2 = new TreeSet<>(nums);
        System.out.println(integers2);
        for (Integer num : integers2) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


        List<String> stringList = List.of("a", "b", "c", "d");
        HashSet<String> stringHashSet = new HashSet<>(stringList);
        System.out.println(stringHashSet);


        List<String> strings = List.of("один", "два","два", "три", "три", "три");
        Map<String, Integer> result = new HashMap<>();

        for (String string : strings) {
            Integer value = result.get(string);
            if (value != null) {
                result.put(string, value + 1);
            } else {
                result.put(string, 1);
            }
        }
        System.out.println(result);
    }
}