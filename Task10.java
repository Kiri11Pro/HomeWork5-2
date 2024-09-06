import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    //    Заполнить массив размерности n случайными цифрами от 0 до 33. Найти элемент массива, который делится
//без остатка на значение элемента слева и значение элемента справа. Вывести на консоль значения исходного массива.
//Вывести индекс найденного элемента, если такой не найден,
//вывести -1. n – задается с клавиатуры.
    public static void main(String[] args) {
        int n, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = scan.nextInt();
        k = 0;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(0, 33);
        }
        System.out.println(Arrays.toString(array));
        for (int j = 1; j < n - 1; j++) {
            if ((array[j - 1] == 0) || (array[j + 1] == 0)) {
                continue;
            }
            if ((array[j] % array[j - 1] == 0) & (array[j] % array[j + 1] == 0)) {
                k++;
                System.out.println(j);
            } else if (k == 0 && j == n - 2) {
                System.out.println("-1");
            }
        }
    }
}
