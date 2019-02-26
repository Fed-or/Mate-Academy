import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus {

    private static final String STAR_CONST = "* ";
    private static final String SPACE_CONST = " ";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rhombusSide = Integer.parseInt(reader.readLine());

        createRhombus(rhombusSide);
        reader.close();
    }

    public static void createRhombus(int diagonalOfRhombus) {

        for (int i = 0; i < diagonalOfRhombus; i++) {
            for (int space = 0; space < diagonalOfRhombus - i; space ++) {
                System.out.print(SPACE_CONST);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(STAR_CONST);
            }
            System.out.println();
        }
        for (int i = diagonalOfRhombus - 2; i >= 0; i--) {
            for (int space = 0; space < diagonalOfRhombus - i; space++) {
                System.out.print(SPACE_CONST);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(STAR_CONST);
            }
            System.out.println();
        }
    }
}