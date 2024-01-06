public class Madhav {
    public static void main(String[] args) {
        System.out.println("isMadhav: "+isMadhav(new int[]{2, 1, 1}));
        System.out.println(isMadhav(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhav(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhav(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhav(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println("isMadhav: "+isMadhav(new int[]{3, 1, 2, 3, 0}));
    }
    static int isMadhav(int[] arr){
        int n = 1;
        int commonSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0 ; j < n; j++){
                commonSum += arr[i];
//                System.out.println("i: "+i+" commonSum: "+commonSum+" arr["+i+"]: "+arr[i]+" n: "+n);
                i++;
//                System.out.println("j: "+j);
            }
            if(commonSum != arr[0]){
                return 0;
            }
            i--;
            n++;
            commonSum = 0;
            if(arr.length < n*(n-1)/2){
                System.out.println("n: "+n+" arr.length: "+arr.length+" n*(n+1)/2: "+n*(n+1)/2);
                return 0;
            }
        }
        return 1;
    }
}
