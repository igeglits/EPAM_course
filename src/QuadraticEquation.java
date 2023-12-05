import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

class QuadraticEquation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double coefficientA = in.nextDouble();

        double coefficientB = in.nextDouble();

        double coefficientC = in.nextDouble();
        double discriminant = (pow(coefficientB, 2) - 4 * coefficientA * coefficientC);

        if (0 > discriminant) {
            System.out.println("no roots");
        } else if (0 == discriminant) {
            double root0 = -coefficientB / (2 * coefficientA);
            System.out.print(root0);
        } else {
            double root1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            double root2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);

            System.out.println(root1 + " " + root2);

        }

    }
}

