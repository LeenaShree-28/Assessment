public class Q4 {
    public static void pair(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % k == 0) {
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 5;
        pair(arr, k);
    }
}