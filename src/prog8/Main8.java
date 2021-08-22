/*
8.Создать метод, который принимает в параметры два массива: с 1 и 7 задания,
метод возвращает новый массив сумм значений первого и второго массива.
 */

import java.util.Arrays;

public class Main8 {

    public static void main(String[] args) {
	// write your code here
        final   int ARR_LNG = 30;
        final int   MIN = 0;
        final int   MAX = 50;

        //Из 1 задания
        int[] arr1 = new int[ARR_LNG];

        for (int i = 0; i < arr1.length; i++)
            arr1[i] = (int) (Math.random() * (MAX - MIN) + MIN) ;

        System.out.printf("Массив заполнен случайными числами от %d до %d: \n", MIN, MAX);
        System.out.println(Arrays.toString(arr1));

        //Из 2 задания
        int[] arr2 = new int[ARR_LNG];

        for (int i = 0; i < arr2.length; i++)
            arr2[i] = i * i;

        System.out.println("\nМассив с квадратами индексов:");
        System.out.println(Arrays.toString(arr2));

        // Текущее задание: плюсуем ячейки двух массивов в новый массив
        int[] arr3 = sumCellTwoArr(arr1, arr2);
        System.out.println("\nМассив с суммой ячеек предыдущих массивов: \n" + Arrays.toString(arr3));

    }

    //суммируем значения соответствующих ячеек двух массивов и возвращаем результат в виде нового массива
    public static int[] sumCellTwoArr(int[]  array1, int[]  array2)
    {
        int[] arrayOut = new int[array1.length];

        for (int i = 0; i < arrayOut.length; i++)
            arrayOut[i] = array1[i] + array2[i];

        return arrayOut;
    }


}
