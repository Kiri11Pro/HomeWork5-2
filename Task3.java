import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
//    Написать программу, которая проверяет, все ли значения
//    элементов массива одинаковые. Вывести: Yes – если все оди
//наковы и No – если имеется хоть одно различие. Массив за
//дается и инициализируется в начале программы.
    public static void main(String[] args) {
        int size, j;
        j = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива");
        size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < size-1; i++) {
            if (array[i] != array[j]) {
                System.out.println("No");
                break;
            }
            j++;
            if (j == size) {
                System.out.println("Yes");
            }
        }
    }
}

