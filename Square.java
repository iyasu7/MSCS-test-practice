public class Square {
    public static void main(String[] args) {
        System.out.println("isSquare : " + isSquare(4));
        System.out.println("isSquare : " + isSquare(25));
        System.out.println("isSquare : " + isSquare(-16));
        System.out.println("isSquare : " + isSquare(0));
        System.out.println("isSquare : " + isSquare(8));
    }
    static int isSquare(int n){
        if(n<0)
        return 0;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=1; i<=n/2; i++){
            if(i*i==n){
                return 1;
            }
        }
        return 0;
    }
}
