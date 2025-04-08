package Easy;

public class NumberOfZeros {
    public static void main(String[] args) {
        int ans = Zeros(20304);
        System.out.println(ans); // Output: 2
    }

    public static int Zeros(int n) {
        if (n == 0) return 0;
        int rem = n % 10;

        if (rem == 0) return 1 + Zeros(n / 10);
        else return Zeros(n / 10);
    }
}



//        int ans = Zeros(20304);
//        System.out.println(ans);
//    }
//
//    public static int Zeros(int n) {
//        String num = String.valueOf(n);
//        int count = 0;
//
//        for (int i = 0; i < num.length(); i++) {
//            if (num.charAt(i) == '0') {
//                count++;
//            }
//        }
//        return count;



//public static int Zeros(int n) {
//    int count = 0;
//
//    while (n > 0) {
//        int rem = n % 10;
//        if (rem == 0) {
//            count++;
//        }
//        n /= 10; // Always divide n
//    }
//    return count;