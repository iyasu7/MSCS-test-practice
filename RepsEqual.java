public class RepsEqual {
    public static void main(String[] args) {
        System.out.println("findRepsEqual :" + findRepsEqual(new int[] { 3, 2, 0, 5, 3 }, 32053));
        System.out.println("findRepsEqual :-"+findRepsEqual(new int[] {0,3, 2, 0, 5, 3,
        4}, 320534));
        System.out.println("findRepsEqual :-"+findRepsEqual(new int[] { 3, 2, 0, 5, 3
        }, 3205));
    }

    static int findRepsEqual(int[] a, int n) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int div = (int) Math.pow(10, (len - i - 1));
            int currNum = (int) n / div;
            n = (int) n % div;
            System.out.println("currNum :" + n + " " + div);
            if (currNum >= 10) {
                System.out.println("arr len is not equal to n len "+currNum);
                return 0;
            }
            if (a[i] != currNum) {
                System.out.println("currNum :" + currNum + ", a[" + i + "] :" + a[i]);
                return 0;
            }
        }
        return 1;
    }
}
