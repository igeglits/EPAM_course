import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int current;
        int count = -1;
        do {

            current = scanner.nextInt();
            sum += current;
            count++;
        }
        while (current != 0);
        System.out.println(Math.round(sum/count));
    }
}
