public class GuthrieSequence {
    public static void main(String[] args) {
        // System.out.println("isGuthrieSequence : "+isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println("isGuthrieSequence : "+isGuthrieSequence(new int[]{7, 23, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 2}));
    }   
    static int isGuthrieSequence(int[] arr){
        int len = arr.length;
        if(arr[len-1]!=1){
            System.out.println("last num in array is not one");
        return 0;
    }

        int i = 0;
        int curr = arr[0];
        while(i<len){
            if(arr[i]!=curr){
            System.out.println("current value is not equal to the expected value from the previous calculation");
                return 0;
            }
            if(arr[i]%2==1){
                curr = 3*arr[i] + 1;
            } else {
                curr /= 2;
            }
            i++;
        }
        return 1;
    }
}
