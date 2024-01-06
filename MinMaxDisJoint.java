public class MinMaxDisJoint {
    public static void main(String[] args) {
        
    }
    static int isMinMaxDisJoint(int[] a){
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            } else if (a[i] < minValue){
                minValue = a[i];
            }
        }
        for(int i = 0; i<a.length; i++){
            
        }
    }
}
