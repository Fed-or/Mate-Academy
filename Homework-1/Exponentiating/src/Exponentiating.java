import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponentiating {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int power = Integer.parseInt(reader.readLine());

        System.out.println("Number " + number + " squared = " + raiseToPower(number, 2) + ";");
        System.out.println("Number " + number + " cubed = " + raiseToPower(number, 3) + ";");
        System.out.println("Number " + number + " power " + power + " = " + raiseToPower(number, power) + ";");
    }

    public static double raiseToPower(int base, int exponent) {
        int positive = 1;
        double negative = 1.0;

        int power = exponent;
        if (exponent < 0) {
            exponent = -exponent;
        }

        for (int i = 1; i <= exponent; i++) {
            positive *= base;
            negative /= base;
        }
        return (power >= 0) ? positive : negative;
    }
}
