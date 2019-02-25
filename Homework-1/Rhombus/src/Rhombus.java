import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rhombusSide = Integer.parseInt(reader.readLine());

        createRhombus(rhombusSide);
    }

    public static void createRhombus(int diagonalOfRhombus) {

        String space = " ";
        String star = "* ";

        for (int i = 0; i < diagonalOfRhombus; i++) {
            for (int y = 0; y < diagonalOfRhombus - i; y++) {
                System.out.print(space);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        for (int i = diagonalOfRhombus - 2; i >= 0; i--) {
            for (int y = 0; y < diagonalOfRhombus - i; y++) {
                System.out.print(space);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
