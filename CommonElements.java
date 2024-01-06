import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        System.out.println("CommonElements : " + Arrays.toString(findCommonElements(new int[]{1, 8, 3, 2}, null)));
        System.out.println("CommonElements : " + Arrays.toString(findCommonElements(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})));
        System.out.println("CommonElements : " + Arrays.toString(findCommonElements(new int[]{1, 8, 4, 2, 6}, new int[]{4, 2, 6, 1})));
    }

    static int[] findCommonElements(int[] first, int[] sec) {
        if(first==null || sec == null)
        return null;
        if(first.length==0 || sec.length==0)
        return new int[]{};
        int index = 0;
        int commonElemArrLen = first.length >= sec.length ? first.length : sec.length;
        int[] commonElemArr = new int[commonElemArrLen];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < sec.length; j++) {
                if(first[i]==sec[j]){
                    // System.out.println("first["+i+"] "+first[i]+", sec["+j+"] "+sec[j]+" .");
                    
                    commonElemArr[index]= first[i];
                    // System.out.println("Returned : "+Arrays.toString(commonElemArr));
                    index++;
                }
            }
        }
        int[] returnedArr = new int[index];
        for (int i = 0; i < index; i++) {
            returnedArr[i] = commonElemArr[i];
        }
        return returnedArr;
    }
}
