import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                continue;
            }
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1254, 2, 3, 4, 4, 5, 5, 6, 7,12,86,154,3,28, 1556));
        TreeSet<Integer> setNums = new TreeSet<>();
        for (Integer i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                continue;
            }
            setNums.add(nums.get(i));
        }
        System.out.print(setNums + " ");
        System.out.println();
    }
    public static void task3() {
        System.out.println("Task 3");
        List<String> str = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "один", "один", "четыре"));
        Set<String> setStr = new HashSet<>();
        for (String s : str) {
            setStr.add(s);
        }
        System.out.print(setStr + " ");
        System.out.println();
    }
    public static void task4() {
        System.out.println("Task 4");
        List<String> words = new ArrayList<>(List.of("один", "два","два", "два","два", "два","два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                Integer count = map.get(word) + 1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map.values());
    }
}
