/*
3.Заполнить двумерный массив 10х10 случайными числами
от -30 до 70. Использовать Math.random();
 */

public class Main3 {

    public static void main(String[] args) {
	// write your code here

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


    }
}
