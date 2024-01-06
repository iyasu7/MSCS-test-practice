public class NFactorial {
    public static void main(String[] args) {
        // System.out.println(factorial(10));
        System.out.println(2*factorial(9)+" - "+factorial(8));
    }
    // static int[] solve10(){

    // }
    static int factorial(int n){
        int sumFac = 1;
        for(int i =1;i<=n; i++){
            sumFac*=i;
        }
        // int[] a = new int []{x,n};
        return sumFac;
    }
}
