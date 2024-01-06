public class Stacked {
    public static void main(String[] args) {
        System.out.println("isStacked : "+ isStacked(10));
        System.out.println("isStacked : "+ isStacked(7));
        System.out.println("isStacked : "+ isStacked(15));
    }
    static int isStacked(int n){
        int result = 0;
        int i=1;
        while (result<=n){
            if(result+i==n){
                return 1;
            }
            result+=i;
            i++;
        }
        return 0;
    }
}
