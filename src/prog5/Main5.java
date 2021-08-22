/*
5.Создать метод, который принимает в параметры созданный массив с 1 задания,
находит в нем наименьшее значение и возвращает его ИНДЕКС.
 */

import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
	// write your code here

        //Из 1 задания

        final int   MIN = 0;
        final int   MAX = 50;

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * (MAX - MIN) + MIN) ;

        System.out.printf("Массив заполнен случайными числами от %d до %d: \n", MIN, MAX);
        System.out.println(Arrays.toString(arr));

        //Текущее задание: найти индекс минимального в массиве
        System.out.printf("\nИндекс минимального числа в массиве: %d \n", arrIndexMin(arr));

        }

    //возвращает индекс минимального числа в массиве
    public static int arrIndexMin(int[]  array)
    {
        int minIndex = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] < array[minIndex])
               minIndex = i;
            
        return minIndex;
    }
}
