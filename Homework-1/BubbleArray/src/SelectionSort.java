
public class SelectionSort { //сортировка выбором

    public static void selectSort(int[] numbers) {

        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int y = i + 1; y < numbers.length; y++) {
                if (numbers[y] < numbers[min])
                    min = y;
            }

            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }
}
