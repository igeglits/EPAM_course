import java.util.Scanner;

class GoDutch {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int bill = scanner.nextInt();
        int friends = scanner.nextInt();

        if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        }
        else if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else {

            System.out.println((bill +bill/10)/friends);
        }

    }
}
