import java.util.ArrayList;

public class Q2FibonacciAndPrime {
    public void checkAns() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int count = 10;
        int n1 = 0;
        int n2 = 1;
        int n3;
        list1.add(n1);
        list1.add(n2);
        int i = 2;
        while (i < count) {
            n3 = n1 + n2;
            list1.add(n3);
            n1 = n2;
            n2 = n3;
            i++;
        }
        for (int num : list1) {
            int m = (int) Math.sqrt(num) + 1;
            boolean flag = false;
            if(num==2){
                list2.add(num);
            }
            if (num != 0 && num != 1) {
                for (int j = 2; j <= m; j++) {
                    if (num % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    list2.add(num);
                }
            }
        }
        for (int j : list2) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Q2FibonacciAndPrime fibonacciAndPrime = new Q2FibonacciAndPrime();
        fibonacciAndPrime.checkAns();
    }
}