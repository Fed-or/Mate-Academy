import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        reader.close();

        System.out.println("Factorial" + number + ": " + "\n" + fact(number));
        System.out.println();
        System.out.println("Firsts " + number + " numbers Fibonacci: ");
        for (int i = 0; i < number; i++) {
            System.out.println(i + ": " + fibonacci(i));
        }
        System.out.println();
    }

    public static int fact(int number) {
        return (number == 1 || number == 0) ? 1 : fact(number - 1) * number;

    }

    public static int fibonacci(int numbersFibonacci) {

        if (numbersFibonacci == 1 || numbersFibonacci == 2) {
            return 1;
        }
        if (numbersFibonacci == 0) {
            return 0;
        }
        return fibonacci(numbersFibonacci - 1) + fibonacci(numbersFibonacci - 2);

    }
}