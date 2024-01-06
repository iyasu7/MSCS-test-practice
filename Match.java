public class Match {
    public static void main(String[] args) {
        System.out.println("matches : "+   matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3,-2,3}));
        System.out.println("matches : "+   matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println("matches : "+   matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
        System.out.println("matches : "+   matches(new int[]{1, 2, -3, -5, -5, 2, 3, -18}, new int[]{2,-3,2,-1}));
    }

    static int matches(int[] a, int[] p) {
        // if(p.length!=p[0])
        // return 0;

        int currIndex = 0;
        for (int i = 0; i < p.length; i++) {
            int value = Math.abs(p[i]);
            if (p[i] < 0) {
                for (int j = 0; j < value; j++) {
                    if(a[j+currIndex]>=0)
                    return 0;
                }
            } else {
                for (int j = 0; j < value; j++) {
                    if(a[j+currIndex]<=0)
                    return 0;

                }
            }
            currIndex+=value;
        }
        return 1;
    }
}
