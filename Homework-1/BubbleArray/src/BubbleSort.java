import java.util.Arrays;
import java.util.Random;

public class BubbleSort { //пузырьковая сортировка
    public static void toBubbleSort(int[] arrayForSort) {

        for (int i = arrayForSort.length - 1; i >= 1; i--) {
            for (int y = 0; y < i; y++) {
                if (arrayForSort[y] > (arrayForSort[y + 1])) {
                    int temp = arrayForSort[y];
                    arrayForSort[y] = arrayForSort[y + 1];
                    arrayForSort[y + 1] = temp;
                }
            }
        }
    }
}