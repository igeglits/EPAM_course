import java.io.IOException;
import java.util.Scanner;

class HelloStrangers {
    public static void main(String[] args) throws IOException {
        int number = new Scanner(System.in).nextInt();

        if (number < 0) {
            System.out.println("Seriously? Why so negative?");
        }
        if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        if (number > 0) {
            String[] array = new String[number];
            for (int j = 0; j < array.length; j++) {
                var name = new Scanner(System.in).nextLine();
                array[j] = name;
            }
            System.out.println(number);
            for (String string : array) {
                System.out.println("Hello, " + string);
            }
        }

    }
}

