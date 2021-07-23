
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int a : array) {
            if (smallest > a) {
                smallest = a;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = array[indexOfSmallest];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallest = table[indexOfSmallest];
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] <= smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp1 = array[index1];
        int temp2 = array[index2];
        array[index1] = temp2;
        array[index2] = temp1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }

}
