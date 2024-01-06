public class PrimeCount {
    public static void main(String[] args) {
        System.out.println(nPrimeCount(1,10));
        System.out.println(nPrimeCount(10,30));
        System.out.println(nPrimeCount(11,29));
        System.out.println(nPrimeCount(20,22));
        System.out.println(nPrimeCount(1,1));
        System.out.println(nPrimeCount(5,5));
        System.out.println(nPrimeCount(6,2));
    }
    static int nPrimeCount(int start,int end) {
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return isPrime(start) ? 1 : 0;
        }
        int primeCount = 0;
        for(int i = start;i<=end;i++){
            if(isPrime(i)){
                primeCount++;
            }
        }
        return primeCount;
    }
    static boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
