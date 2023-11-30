public class WhileContinueOuter {
    public static void main(String[] args) {
        int i = 0;
        outer: while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 3) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("\n Начало итерации");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("Завершение итерации");
        }
    }
}
