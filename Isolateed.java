public class Isolateed {
    public static void main(String [] args){
        System.out.println("Is isolated : " + isIsolated(2));
        System.out.println("Is isolated : " + isIsolated(3));
        System.out.println("Is isolated : " + isIsolated(4));
        System.out.println("Is isolated : " + isIsolated(8));
        System.out.println("Is isolated : " + isIsolated(9));
        System.out.println("Is isolated : " + isIsolated(14));
        System.out.println("Is isolated : " + isIsolated(24));
        System.out.println("Is isolated : " + isIsolated(28));
        System.out.println("Is isolated : " + isIsolated(34));
        System.out.println("Is isolated : " + isIsolated(33));
        System.out.println("Is isolated : " + isIsolated(2097152));
    }
    static int isIsolated(long n){
        if(n>2097151){
            return -1;
        }
        long square = n*n;
        long cube = n*n*n;

        int squareLength = Long.toString(square).length();
        int cubeLength = Long.toString(cube).length();

        long[] squareArray = new long[squareLength];
        // int[] cubeArray = new int[cubeLength];

        long digit = 0;
        for(int i=0;i<squareLength;i++){
            digit = square%10;
            square/=10;
            squareArray[i] = digit;
        }
        for(int i=0;i<cubeLength;i++){
            digit = cube%10;
            cube/=10;
            // cubeArray[i] = digit;
            for(int j=0;j<squareLength;j++){
                if(squareArray[j]==digit){
                    return 0;
                }
            }
        }
        return 1;
    }
}
