public class WhileBreakOuter {
    public static void main(String[] args) {
        int i = 0;
        outer: while ( i < 5) {
            int j = 0;
            while (j < 3) {
                j++;
                System.out.println("i=" + i + ", j=" + j);
                break outer;
            }
        }
    }
}
