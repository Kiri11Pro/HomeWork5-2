import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    //    Заполнить массив размерности n случайными цифрами
//от –2 до n. Если в массиве есть хотя бы одно отрицательное
//значение меньше -1, заменить все отрицательные значение
//в массиве на квадрат (в степени 2) этих значений. Вывести
//исходный и результирующий массив на консоль.
    public static void main(String[] args) {
        int[] array;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = scan.nextInt();
        array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(-2, n);
        }
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                array[j] = array[j] * array[j];
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
