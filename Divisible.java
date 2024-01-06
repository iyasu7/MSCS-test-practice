public class Divisible {
    public static void main(String[] args) {
        // System.out.println("Divisible : "+ isDivisible(new int[]{3, 3, 6, 36}, 3));
        // System.out.println("Divisible : "+ isDivisible(new int[]{3, 4, 3, 6, 36}, 3));
        System.out.println("Divisible : "+ isDivisible(new int[]{}, 3));
    }
    static int isDivisible(int [ ] arr, int divisor){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor!=0){
                return 0;
            }
        }
        return 1;
    }
}