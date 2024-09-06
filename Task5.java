import java.util.Arrays;
import java.util.Random;

public class Task5 {
    //    Заполнить массив на 10 элементов случайными числами
//от -10 до +10. Посчитать количество повторяющихся значений. Вывести на консоль только повторяющиеся элементы
//и количество повторений.
//Пример:
//0 – 5 раз
//2 – 3 раза
//7 – 1 раз
    public static void main(String[] args) {
        int a, count, randomNum, j;
        int[] array = new int[10];
        String b = "";
        Random random = new Random();
        count = 0;
        a = 0;
        j = 0;
        for (int i = 0; i < array.length; i++) {
            randomNum = random.nextInt(-10, 10);
            array[i] = randomNum;
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int k = 0; k < array.length; k++) {
            for (j = k + 1; j < array.length; j++) {
                if (array[k] == array[j]) {
                    count++;
                    a = array[k];
                }
                if (count > 0 && j == 9) {
                    int[] arrayB = {1, 5, 6, 7, 8, 9};
                    for (int n = 0; n < 6; n++) {
                        if (count == arrayB[n]) {
                            b = " раз";
                            break;
                        } else {
                            b = " раза";
                        }
                    }
                    System.out.println(a + " - " + count + b);
                    k = k + count;
                    count = 0;
                }
            }
        }
    }
}
