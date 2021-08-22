/*
4.Создать метод, который принимает в параметры созданный массив с 3 задания,
считает сумму всех чисел и возвращает её.
 */

public class Main4 {

    public static void main(String[] args) {
	// write your code here
        //из 3-го задания
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

        //Текущее задание: сумма чисел в массиве
        System.out.printf("\nСумма чисел в массиве: %d \n", arrSum(arr));

    }

    //возвращает сумму чисел массива
    public static int arrSum(int[][]  array)
    {
        int sum = 0;

        for (int[] arTmp : array)
            for (int val : arTmp)
                sum += val;

        return sum;
    }

}
