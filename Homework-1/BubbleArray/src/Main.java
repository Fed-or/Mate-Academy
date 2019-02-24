import java.lang.reflect.Member;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] unSortArray = new int[10];

        for (int i = 0; i < unSortArray.length; i++) {
            unSortArray[i] = (random.nextInt(100));
        }

        System.out.println();
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(unSortArray));

        long before = System.currentTimeMillis();

        BubbleSort.toBubbleSort(unSortArray);
        System.out.println();

        System.out.println("После пузырьковой сортировки: ");
        System.out.println(Arrays.toString(unSortArray));

        long after = System.currentTimeMillis();
        long diff = after - before;

        System.out.println("Время выполнения: " + diff + "мс");

        System.out.println();

        // Сортировка выбором:

        long before2 = System.currentTimeMillis();

        SelectionSort.selectSort(unSortArray);

        System.out.println("После сортировки выбором: ");
        System.out.println(Arrays.toString(unSortArray));

        long after2 = System.currentTimeMillis();
        long diff2 = after2 - before2;

        System.out.println("Время выполнения: " + diff2 + "мс");
        System.out.println();

        // Быстрая сортировка:

        long before3 = System.currentTimeMillis();

        QuickSort.quickSort(unSortArray, 0, unSortArray.length - 1);

        System.out.println("После быстрой сортировки: ");
        System.out.println(Arrays.toString(unSortArray));

        long after3 = System.currentTimeMillis();
        long diff3 = after3 - before3;

        System.out.println("Время выполнения: " + diff3 + "мс");
        System.out.println();

        // Cортировка вставками:

        long before4 = System.currentTimeMillis();

        InsertSort.toInsertSort(unSortArray);

        System.out.println("После сортировки вставками: ");
        System.out.println(Arrays.toString(unSortArray));

        long after4 = System.currentTimeMillis();
        long diff4 = after4 - before4;

        System.out.println("Время выполнения: " + diff4 + "мс");
        System.out.println();

        // Cортировка слиянием:

        long before5 = System.currentTimeMillis();

        MergeSort.mergeSort(unSortArray);

        System.out.println("После сортировки слиянием: ");
        System.out.println(Arrays.toString(unSortArray));

        long after5 = System.currentTimeMillis();
        long diff5 = after5 - before5;

        System.out.println("Время выполнения: " + diff5 + "мс");
        System.out.println();

    }
}
