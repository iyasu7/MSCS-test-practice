public class StantonMeasure {
    public static void main(String[] args) {
        // System.out.println("stantonMeasure "+stantonMeasure(new int[]{3, 1, 1, 4}));  
        // System.out.println("stantonMeasure :"+stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3, 2}));  
        System.out.println("stantonMeasure :"+stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));  
    }
    static int stantonMeasure(int[] arr){
        int len = arr.length;
        int count = 0;
        int result = 0;
        for(int i = 0 ; i < len ; i++){
            if(arr[i]==1){
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        for(int i=0 ; i < len ; i++){
            if(arr[i]==count){
                result++;
            }
        }
        return result;
    }
}
