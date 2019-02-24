import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponentiating {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int power = Integer.parseInt(reader.readLine());

        raiseToPower(number, power);
    }

    public static void raiseToPower(int base, int exponent) {
        System.out.println("Число " + base + " в квадрате равно: " + Math.pow(base, 2) + ";");
        System.out.println("Число " + base + " в кубе равно: " + Math.pow(base, 3) + ";");
        System.out.println("Число " + base + " в степени " + exponent + " равно: " + Math.pow(base, exponent) + ";");
    }
}