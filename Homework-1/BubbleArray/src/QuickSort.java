public class QuickSort {


    public static void quickSort(int[] array, int left, int right) {  // эту сортировку, честно списал и пока не успел разобраться как работает
        int index = partition(array, left, right);
        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);
    }

    public static int partition(int[] array, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;

            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }
}
