import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
    }
    public static void task3() {
        System.out.println("Task 3");
        List<String> str = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<Integer> setStr = new TreeSet<>();
        for (Integer i = 0; i < str.size(); i++) {
            setStr.add(Integer.valueOf(str.get(i)));
        }
        System.out.print(setStr + " ");
    }
}
