public class Inertial {
    public static void main(String[] args) {
//        System.out.println("isInertial: "+isInertial(new int[]{11, 4, 20, 9, 2, 8}));
//        System.out.println("isInertial: "+isInertial(new int[]{12, 11, 4, 9, 2, 3, 10}));
//        System.out.println("isInertial: "+isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println("isInertial: "+isInertial(new int[]{2, 4, 6, 8, 10}));
        System.out.println("isInertial: "+isInertial(new int[]{2, 3, 5, 7}));

    }
    static int isInertial(int[] arr){
        int len = arr.length;
        int numOfOdds=0;
        int maxValue= (int)Double.NEGATIVE_INFINITY;
//        System.out.println("maxValue: "+maxValue);


        for(int i=0;i<len;i++){
            if(arr[i]%2!=0){
                numOfOdds++;
            }
            if(arr[i]>maxValue){
//                System.out.println("value: "+arr[i]);
                maxValue=arr[i];
//                System.out.println("max: "+maxValue);
            }
        }
        System.out.println("numOfOdds: "+numOfOdds);
        System.out.println("maxValue: "+maxValue);
        if (numOfOdds < 1 || maxValue%2 != 0){
            System.out.println("no Odd numbers or MaxValue not Even");
            return 0;
        }
        for(int i=0;i<len;i++){
            if(arr[i]%2==1 && arr[i]<maxValue){
                for(int j=0; j< len; j++){
                    if(arr[j] %2 == 0 && arr[j]!=maxValue){
                      if(arr[i]<arr[j]){
                          System.out.println("Odd value not greater than the evens || not maximum");
                          return 0;
                      }
                    }
                }
            }
        }



        return 1;
    }
}
