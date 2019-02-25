import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus {

    public static final String innerOfRhombus = "* ";
    public static final String outsideOfRhombus = " ";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rhombusSide = Integer.parseInt(reader.readLine());

        createRhombus(rhombusSide);
        reader.close();
    }

    public static void createRhombus(int diagonalOfRhombus) {

        for (int i = 0; i < diagonalOfRhombus; i++) {
            for (int space = 0; space < diagonalOfRhombus - i; space ++) {
                System.out.print(outsideOfRhombus);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(innerOfRhombus);
            }
            System.out.println();
        }
        for (int i = diagonalOfRhombus - 2; i >= 0; i--) {
            for (int space = 0; space < diagonalOfRhombus - i; space++) {
                System.out.print(outsideOfRhombus);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(innerOfRhombus);
            }
            System.out.println();
        }
    }
}