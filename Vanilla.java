public class Vanilla {
    public static void main(String[] args) {
        System.out.println("is Vanilla : " + isVanilla(new int[]{1,11,111,-1111}));
        System.out.println("is Vanilla : " + isVanilla(new int[]{1,11,101,1111}));
        System.out.println("is Vanilla : " + isVanilla(new int[]{1}));
    }
    static int isVanilla(int[] a){
        if(a.length==0){
            return 1;
        }
        int value = Math.abs(a[0]%10);
        for(int i=0;i<a.length;i++){
            int newNum = a[i];
            while(newNum > 0){
                int digit = Math.abs(newNum%10);
                if(digit!=value){
                    return 0;
                }
                newNum /= 10; 
            }
        }
        return 1;
    }
}
