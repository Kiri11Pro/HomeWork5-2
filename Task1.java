import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int size, k, i, j;
        size = 15;
        k = 0;
        j = 0;
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (i = 2; i < size; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        System.out.println(array);
        for (i = 0; i < size; i++) {
            if (array[i] % 2 == 0)
                j++;
        }
        int[] even = new int[j];
        for (i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                even[k] = array[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(even));
    }
}
