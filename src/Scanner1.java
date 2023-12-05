import java.util.Scanner;
class Scanner1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int bill = scanner.nextInt();
        int friends = scanner.nextInt();
    }
}
class Scanner2 {
    public static void main(String[] args) {
        int bill = new Scanner(System.in).nextInt();
        int friends = new Scanner(System.in).nextInt();
    }
}
