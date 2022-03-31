import java.util.*;

public class Task {
    public int findDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            } else {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 1, 2, 3, 3 };
        int[] arr2 = { 2, 1, 3, 5, 3, 2, 3 };
        Task task = new Task();
        System.out.println(task.findDuplicates(arr));
        System.out.println(task.findDuplicates(arr1));
        System.out.println(task.findDuplicates(arr2));
    }
}
