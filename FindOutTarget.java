package Arrays;

import java.util.ArrayList;

public class FindOutTarget {
    public static void main(String[] args) {
        int[] arr = {12, 13, 20, 20, 40, 50};
        System.out.println(find(arr, 20, 0));
        System.out.println(findIndex(arr, 13, 0));
        findAllIndex(arr, 20, 0);
        System.out.println(list);

    }

    // method - 1
    public static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) return true;
        return arr[index] == target || find(arr, target, index + 1);
    }

    // Method - 2
    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}
