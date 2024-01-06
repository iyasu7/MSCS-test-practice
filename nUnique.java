public class nUnique {
    public static void main(String[] args) {
        System.out.println("n-Unique : "+ isUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println("n-Unique : "+ isUnique(new int[]{7, 3, 2, 4}, 11));
    }

    static int isUnique(int[] arr, int n) {
        int len = arr.length;
        int numOfUniques = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==n){
                    numOfUniques++;
                }
            }
        }
        if(numOfUniques==1){
            return 1;
        }
        return 0;
    }
}
