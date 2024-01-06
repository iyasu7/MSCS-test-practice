public class SumSafe {
    public static void main(String[] args) {
        System.out.println("is Sum Safe : " + isSumSafe(new int[]{5,-5,0}));
        System.out.println("is Sum Safe : " + isSumSafe(new int[]{5,-3,0}));
    }
    static int isSumSafe(int[] a){
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        for(int i: a){
            if(i==sum){
                return 0;
            }
        }
        return 1;
    }
}
