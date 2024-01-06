public class porcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0)
            return false;

        int sqrt = (int) Math.sqrt(num) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findPorcupineNumber(int num) {
        num++;
        if(num%10!=9){
            num = num + (9 - num%10);
        }
        while(num % 10 == 9) {
            System.out.println("module"+num+"-"+num%10);
                if(isPrime(num)){
                    System.out.println("prime"+num);
                    num+=10;
                    while(true){
                        if (num%10==9 && isPrime(num)) {
                            System.out.println(num+" isP :"+isPrime(num));
                            return num;
                        }
                        num+=10;
                    }
                }
            num+=10;
        }
        return 0;
    }
}
