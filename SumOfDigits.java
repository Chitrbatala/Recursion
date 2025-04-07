package Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(1234);
        System.out.println(ans);

    }
    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }
}


//        int n = 1234;
//        int sum = 0;
//
//        while (n > 0) {
//            int digit = n % 10;
//            sum += digit;
//            n /= 10;
//        }
//        System.out.println("Sum: " + sum);