public class SqaurePair {
    public static void main(String[] args) {
        // System.out.println(countSquarePairs(new int[] { 9, 0, 2, -5, 7 }));
        System.out.println(countSquarePairs(new int[] {2, 7, 2, 2}));
    }

    static boolean isPerfactSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    static int countSquarePairs(int[] arr) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] <= 0) {
                continue;
            }
            for (int j = 0; j < len; j++) {
                if (arr[j] <= 0 || arr[i] >= arr[j]) {
                    continue;
                }
                if (isPerfactSquare(arr[i] + arr[j])) {
                    System.out.println(" arr[" + i + "] - " + arr[i] + " arr[" + j + "] - " + arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
}
