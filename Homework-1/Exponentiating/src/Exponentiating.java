import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponentiating {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int power = Integer.parseInt(reader.readLine());

        System.out.println("Число " + number + " в квадрате равно: " + raiseToPower(number, 2) + ";");
        System.out.println("Число " + number + " в кубе равно: " + raiseToPower(number, 3) + ";");
        System.out.println("Число " + number + " в степени " + power + " равно: " + raiseToPower(number, power) + ";");
    }
    public static int raiseToPower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
}
