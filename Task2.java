import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int size, randomNum, max, min;
        size = 30;
        int[] array = new int[size];
        Random random = new Random();
        max = -71;
        min = 51;
        for (int i = 0; i < size; i++) {
            randomNum = random.nextInt(-70, 50);
            array[i] = randomNum;
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение =" + min);

    }
}
