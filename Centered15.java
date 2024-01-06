/**
 * Centered-15
 */
public class Centered15 {
    public static void main(String[] args) {
        // System.out.println("isCentered-15 : "+ isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        // System.out.println("isCentered-15 : "+ isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        // System.out.println("isCentered-15 : "+ isCentered15(new int[]{1,1,8, 3, 1, 1}));
        // System.out.println("isCentered-15 : "+ isCentered15(new int[]{4, 4, 15 -4,-4}));
        System.out.println("isCentered-15 : "+ isCentered15(new int[]{9, 15, 6}));
    }
    static int isCentered15(int[] arr){
        int len = arr.length;
        int midIndex = len/2;
        int midValue = 0;
        int ifEven = 0;
        if(len%2==0){
            midValue=arr[midIndex]+arr[midIndex-1];
            System.out.println("len : "+len);
            System.out.println("even : "+midValue);
            ifEven =1;
        }
        else {
            midValue=arr[midIndex];
            System.out.println("odd : "+midValue);
        }

        for(int i=0;i<midIndex;i++){
                    System.out.println("i :"+i);
            if(midValue==15){
                return 1;
            }else if(midValue>15){
                return 0;
            }else {
            midValue+=arr[midIndex+1+i]+arr[midIndex-(1+i+ifEven)];
                if(midValue==15 && i<midIndex-(1+ifEven)){
                    System.out.println("midValue :"+midValue);
                    System.out.println("midValues :"+arr[midIndex+1+i]+" "+arr[midIndex-(1+i)]);
                    System.out.println("midIndex :"+midIndex);
                    System.out.println("i :"+i);
                    return 1;
                }                
            }
        }
                    System.out.println("midValue OUT :"+midValue);
        return 0;
    }
}