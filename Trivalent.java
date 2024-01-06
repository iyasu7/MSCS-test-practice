public class Trivalent {
    public static void main(String[] args) {
        System.out.println("is Trivalent : " + isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println("is Trivalent : " + isTrivalent(new int[]{ 2147483647, -1, -1, -2147483648}));
        System.out.println("is Trivalent : " + isTrivalent(new int[]{}));
    }
    static int isTrivalent(int[] a){
        if(a.length==0){
            return 0;
        }
        int[] newArr = new int[a.length];
        newArr[0] = a[0];
        int differentValues = 1;
        boolean isZeroPresent = a[0]==0;
        for(int i = 1;i<a.length;i++){
            boolean found = false;
            for(int j=0;j<newArr.length;j++){
                int num = a[i];
                if(num==newArr[j]){
                    found = true;
                }
            }
            if(!found){
                newArr[i] = a[i];
                differentValues++;
            }
            if(a[i]==0){
                isZeroPresent = true;
            }
        }
        if(isZeroPresent){
            differentValues++;
        }
        if(differentValues==3){
            return 1;
        }
        return 0;
    }
}
