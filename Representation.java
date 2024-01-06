public class Representation {
    public static void main(String[] args) {
        System.out.println("count Representations: " + countRepresentations(7));
    }

    static int countRepresentations(int n) {
        int count = 0;
        for (int rupee20 = 0; rupee20 <= n/20; rupee20++) {
            for (int rupee10 = 0; rupee10 <= n/10; rupee10++) {
                for (int rupee5 = 0; rupee5 <= n/5; rupee5++) {
                    for (int rupee2 = 0; rupee2 <= n/2; rupee2++) {
                        for (int rupee1 = 0; rupee1 <= n; rupee1++) {
                            if (rupee20*20 + rupee10*10 + rupee5*5 + rupee2*2 + rupee1 == n)
                                count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
