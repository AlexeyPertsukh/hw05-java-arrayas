/*
6.Создать метод, который принимает в параметры созданный массив с 3 задания,
а так же число для поиска в этом массиве. Число для поиска вводим с консоли. Метод должен вернуть
true или false(результат поиска этого числа в двумерном массиве).
 */

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
	// write your code here
        //Из 3 задания
        final int   ARR_LNG = 10;
        final int   MIN = -30;
        final int   MAX = 70;

        int[][] arr = new int[ARR_LNG][ARR_LNG];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                arr[i][j] = (int) (Math.random() * (MAX - MIN) + MIN) ;

        System.out.printf("Массив заполнен случайными числами от %d до %d: \n", MIN, MAX);
        System.out.println("---------------------------------------------------------");

        for (int[] array : arr  )
        {
            for (int val : array  )
                System.out.printf("%3d   ",val);

            System.out.println();
        }

        //Текущее задание: поиск в массиве
        int findVal;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nВведите число для поиска в массиве: ");
        findVal = sc.nextInt();

        boolean resFind = arrFindVal(arr, findVal);
        String  resFindStr =  resFind ? "найдено" : "не найдено";

        System.out.printf("Число %d в массиве %s (%b) \n", findVal, resFindStr, resFind);

    }

    //определяет наличие числа в массиве
    public static boolean arrFindVal(int[][]  array, int findVal)
    {
        boolean find = false;

        RET:
        for (int[] arrTmp : array)
            for (int val : arrTmp)
                if(val == findVal)
                {
                    find = true;
                    break RET;
                }

        return find;
    }

}
