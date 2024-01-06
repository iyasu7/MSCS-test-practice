public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Henry : "+ henry(1, 2));
    }
    static int henry(int i,int j){
        int result = 0;
        int num = 1;
        int numOfPerfectNum = 0;
        while(true){
            if(perfectNumberValue(num)){
                numOfPerfectNum++;
                if(numOfPerfectNum==i){
                    result += num;
                } else if (numOfPerfectNum==j){
                    result += num;
                    return result;
                }
            }
            num++;
        }
    }
    static boolean perfectNumberValue(int n){
        int value = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                value+=i;
            }
        }
        if (value == n) {
            return true;
        }
        return false;
    }
}
