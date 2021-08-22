/*
1.Заполнить одномерный массив на 30 элементов случайными числами
от 0 до 50. Использовать Math.random();
https://vertex-academy.com/tutorials/uk/generaciya-vipadkovix-chisel-u-java/
 */


import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
	// write your code here
        final int   MIN = 0;
        final int   MAX = 50;

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * (MAX - MIN) + MIN) ;

        System.out.printf("Массив заполнен случайными числами от %d до %d: \n", MIN, MAX);
        System.out.println(Arrays.toString(arr));

    }
}
