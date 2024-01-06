public class LegalNumber {
    public static void main(String[] args) {
        // System.out.println("isLegalNumber : " + isLegalNumber(new int[]{1,0,1,1}, 2));
        // System.out.println("isLegalNumber : " + isLegalNumber(new int[]{1,1,2}, 3));
        // System.out.println("isLegalNumber : " + isLegalNumber(new int[]{3,2,5}, 8));
        System.out.println("isLegalNumber : " + isLegalNumber(new int[]{3, 7, 1}, 6));
    }
    static int isLegalNumber(int[] arr, int base){
        int len = arr.length;
        int sum = 0;
        for(int i=0;i<len;i++){
            if(arr[i]<base){
                System.out.println("power : "+ (arr[i]*(int) Math.pow(base, len-1-i)));
                sum+=(arr[i]*(int) Math.pow(base, len-1-i));
            }else{
                return 0;
            }
        }
        System.out.println("sum : "+sum);
        return 1;
    }
}
