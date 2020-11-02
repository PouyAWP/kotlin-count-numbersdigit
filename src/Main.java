import java.util.Arrays;
import java.util.Scanner;
import javax.swing.text.html.parser.*;

public class Main {

    public static void main(String args[]) {

        int[] numbers = {2, 3, 4, 7, 6, 7, 19, 87, 98};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int index = binarySearch(numbers, 7, 0, numbers.length - 1);
        System.out.println(index);

    }

    public static void sort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] numbers, int search, int start, int end) {
        if (end < start) {
            return -1;
        }
        System.out.println("start" + start + "end" + end);

        int middle = (end + start) / 2;

        if (numbers[middle] == search) {
            return binarySearch(numbers, search, middle + 1, end);
        } else {
            return binarySearch(numbers, search, start, middle - 1);
        }

    }
}



