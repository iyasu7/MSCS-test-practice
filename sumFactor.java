public class sumFactor {
    public static void main(String[] args) {
        // System.out.println( "sumFactor : "+ findSumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
        System.out.println( "sumFactor : "+ findSumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println( "sumFactor : "+ findSumFactor(new int[]{0, 0, 0}));
        System.out.println( "sumFactor : "+ findSumFactor(new int[]{9, -3, -3, -1, -1}));
    }
    static int findSumFactor(int[] arr){
        int sum = 0;
        int count = 0;
        for(int val : arr){
            sum += val;
        }
        for (int val : arr){
            if(val == sum){
                count++;
            }
        }
        return count;
    }
}
