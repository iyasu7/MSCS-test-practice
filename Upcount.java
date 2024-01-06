public class Upcount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{1,2,-1,5,3,2,-3},20));
        System.out.println(nUpCount(new int[]{6,3,1},5));
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2},5));
    }
    static int nUpCount(int[] a,int n) {
        int partialSum = 0;
        int upCount = 0;
        for (int j = 0;j < a.length;j++){
            partialSum+=a[j];
            System.out.println(j + " " + partialSum);
            if(partialSum>n && partialSum-a[j]<=n) {
                upCount++;
            }
        }
        return upCount;
    }
}
