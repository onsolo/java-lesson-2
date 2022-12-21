// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;

public class BubbleSorter {
    private FileLogger logger;
    public BubbleSorter() throws IOException {
        this.logger = new FileLogger();
    }

    public void sorter(int[] arr) {
        for (int out = arr.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    int temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;

                    this.logger.info(createLogString(arr, in, in  + 1));
                    this.logger.info(createLogString(arr, in + 1, in));
                }
            }
        }
    }

    public void printer(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public String createLogString(int[] arr, int firstPosition, int secondPosition) {
        return "Элемент " + arr[firstPosition] + " на позиции " +
                firstPosition + " перемещена на позицию " + secondPosition;

    }

    public static void main(String[] args) throws IOException{
        int[] numbers = {1, 5, 2, 8, 12, 0};

        BubbleSorter sorter = new BubbleSorter();
        sorter.sorter(numbers);
        sorter.printer(numbers);
    }
}
