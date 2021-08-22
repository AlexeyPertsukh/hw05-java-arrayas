/*
2.Создать метод, который принимает в параметры созданный массив с 1 задания,
находит в нем самое большое значение и возвращает его.
 */

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        //Из 1 задания

        final int   MIN = 0;
        final int   MAX = 50;

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * (MAX - MIN) + MIN) ;

        System.out.printf("Массив заполнен случайными числами от %d до %d: \n", MIN, MAX);
        System.out.println(Arrays.toString(arr));

        //Текущее задание: найти максимальное в массиве
        System.out.printf("\nМаксимальное число в массиве: %d \n", arrMax(arr));

    }

    //Возвращает максимальное в массиве
    public static int arrMax(int[] array)
    {
        int max = Integer.MIN_VALUE;

        for (int val : array  )
            if(val > max)
                max = val;

        return max;
    }
}
