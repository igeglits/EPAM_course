import java.util.Scanner;

class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int result = a - b;

        if (result > 0 && a < h) {
            System.out.println(h / (result));
        } else if (a > h && result == 0) {
            System.out.println(1);
        } else {
            System.out.println("Impossible");
        }
    }
}
