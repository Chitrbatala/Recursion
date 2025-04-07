package Easy;

public class FibNumber {
    public static void main(String[] args) {
        int ans = printFib(5);
        System.out.print(ans);

    }
    public static int printFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return printFib(n - 2) + printFib(n - 1);
    }
}


//        int n = 5;
//        int f = 0;
//        int s = 1;
//        System.out.print(f + " " + s + " ");
//
//        for (int i = 0; i < n; i++) {
//            int next = f + s;
//            f = s;
//            s = next;
//            System.out.print(next + " ");
//        }