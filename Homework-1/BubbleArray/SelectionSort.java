
public class SelectionSort {

    public static void selectSort(int[] numbers) {

        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int next = i + 1; next < numbers.length; next++) {
                if (numbers[next] < numbers[min])
                    min = next;
            }

            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }
}
