public class depth {
    public static void main(String[] args) {
        System.out.println("computed Depth : "+ computeDepth(42));
        System.out.println("computed Depth : "+ computeDepth(7));
        System.out.println("computed Depth : "+ computeDepth(13));
        System.out.println("computed Depth : "+ computeDepth(25));
    }
    static int computeDepth(int n){
        int[] arr = new int[10];
        int depth = 1;
        while(true){
            int sum = n * depth;
                int digit = 0;
            while(sum!=0){
                digit = sum % 10;

                arr[digit] += 1;
                sum/=10;
            }
            if(arr[0]>=1 && arr[1]>=1 && arr[2]>=1 && arr[3]>=1 && arr[4]>=1 && arr[5]>=1 && arr[6]>=1 && arr[7]>=1 && arr[8]>=1 && arr[9]>=1 ){
                for (int i : arr) {
                    System.out.print(i+", ");
                }
                return depth;
            }
            depth++;
        } 
        // for (int i : arr) {
        //             System.out.print(i+", ");
        //         }
        // return depth;
    }
}
