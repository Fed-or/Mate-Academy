import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] unSortArray = new int[10];

        for (int i = 0; i < unSortArray.length; i++) {
            unSortArray[i] = (random.nextInt(100));
        }

        System.out.println();
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(unSortArray));

        long before = System.currentTimeMillis();

        BubbleSort.toBubbleSort(unSortArray);
        System.out.println();

        System.out.println("after bubble sorting: ");
        System.out.println(Arrays.toString(unSortArray));

        long after = System.currentTimeMillis();
        long diff = after - before;

        System.out.println("Time: " + diff + "ms");

        System.out.println();


        long before2 = System.currentTimeMillis();

        SelectionSort.selectSort(unSortArray);

        System.out.println("after selectSorting: ");
        System.out.println(Arrays.toString(unSortArray));

        long after2 = System.currentTimeMillis();
        long diff2 = after2 - before2;

        System.out.println("Time: " + diff2 + "ms");
        System.out.println();


        long before3 = System.currentTimeMillis();

        QuickSort.quickSort(unSortArray, 0, unSortArray.length - 1);

        System.out.println("after quickly sorting: ");
        System.out.println(Arrays.toString(unSortArray));

        long after3 = System.currentTimeMillis();
        long diff3 = after3 - before3;

        System.out.println("Time: " + diff3 + "ms");
        System.out.println();


        long before4 = System.currentTimeMillis();

        InsertSort.toInsertSort(unSortArray);

        System.out.println("after insertSorting: ");
        System.out.println(Arrays.toString(unSortArray));

        long after4 = System.currentTimeMillis();
        long diff4 = after4 - before4;

        System.out.println("Time: " + diff4 + "ms");
        System.out.println();


        long before5 = System.currentTimeMillis();

        MergeSort.mergeSort(unSortArray);

        System.out.println("after mergeSorting: ");
        System.out.println(Arrays.toString(unSortArray));

        long after5 = System.currentTimeMillis();
        long diff5 = after5 - before5;

        System.out.println("Time: " + diff5 + "ms");
        System.out.println();

    }
}
