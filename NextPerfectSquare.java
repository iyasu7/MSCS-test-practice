public class NextPerfectSquare {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(-5));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(1));
        System.out.println(nextPerfectSquare(2));
        System.out.println(nextPerfectSquare(3));
        System.out.println(nextPerfectSquare(4));
        System.out.println(nextPerfectSquare(5));
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(7));
        System.out.println(nextPerfectSquare(8));
        System.out.println(nextPerfectSquare(9));
        System.out.println(nextPerfectSquare(10));
        System.out.println(nextPerfectSquare(11));
        System.out.println(nextPerfectSquare(12));
        System.out.println(nextPerfectSquare(13));
        System.out.println(nextPerfectSquare(14));
        System.out.println(nextPerfectSquare(15));
        System.out.println(nextPerfectSquare(16));
        System.out.println(nextPerfectSquare(17));
        System.out.println(nextPerfectSquare(18));
        System.out.println(nextPerfectSquare(19));
    }
    static int nextPerfectSquare(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return 4;
        }

        double sqrt = Math.sqrt(n);
        int result = (int)Math.ceil(sqrt);
        return result*result;
    }
}
