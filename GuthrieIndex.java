public class GuthrieIndex {
    public static void main(String[] args) {
        System.out.println("GuthrieIndex : " + findGuthrieIndex(3));
        System.out.println("GuthrieIndex : " + findGuthrieIndex(7));
    }

    static int findGuthrieIndex(int n) {
        int i = 0;
        while (n != 1) {
            System.out.print(n+", ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n) + 1;
            }
            i++;
        }
        return i;
    }
}
