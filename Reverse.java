public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reversed : " + reveresed(-1234));
        System.out.println("Reversed : " + reveresed(0));
        System.out.println("Reversed : " + reveresed(1));
        System.out.println("Reversed : " + reveresed(1000));
        System.out.println("Reversed : " + reveresed(12005));
    }
    static int reveresed(int n){
        int reveresed = 0;
        while(n!=0){
            reveresed = reveresed * 10 + n % 10;
            n/=10;
        }
        return reveresed;
    }
}
