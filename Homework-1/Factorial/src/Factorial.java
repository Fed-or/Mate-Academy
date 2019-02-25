import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Факториал числа " + number + ": " + "\n" + fact(number));
        System.out.println();
        System.out.println("Первые " + number + " чисел ряда Фибоначчи: ");
        for (int i = 0; i < number; i++) {
            System.out.println(i + ": " + fibonacci(i));
        }
        System.out.println();
    }

    public static int fact(int numberForFactorial) {
        int result;

        result = (numberForFactorial == 1 || numberForFactorial == 0) ? 1 :
                fact(numberForFactorial - 1) * numberForFactorial;

        return result;
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