public class SequentiallyBounded {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("is Sequentially Bounded : " + isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println("is Sequentially Bounded : " + isSequentiallyBounded(new int[]{0, 1}));
        System.out.println("is Sequentially Bounded : " + isSequentiallyBounded(new int[]{-1, 2}));
        
        System.out.println("is Sequentially Bounded : " + isSequentiallyBounded(new int[]{}));
        System.out.println("is Sequentially Bounded : " + isSequentiallyBounded(new int[]{5,5,5,5}));
        System.out.println("is Sequentially Bounded : " + isSequentiallyBounded(new int[]{5,5,5,5,5}));
    }
    static int isSequentiallyBounded(int[] arr){
        if(arr.length==0){
            return 1;
        }int prevNum = arr[0]; 
            int count =0;
        for(int i=0;i<arr.length;i++){
            // System.out.print("arr["+i+"] : "+arr[i]+ " prevNum : "+prevNum+", ");
            if(arr[i]<1 || arr[i]<prevNum){
                System.out.println("not in ascending Order");
                return 0; // not in ascending Order
            } else if (arr[i]==prevNum) {
                count++;
                if(count>=arr[i]){
                    System.out.println("Count exceeds");
                    return 0;
                }
            } else {
                count = 0;
            }
            prevNum = arr[i];
        }
        return 1;
    }
}
