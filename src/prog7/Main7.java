/*
7.Сформировать одномерный массив длинной 30, элементами которого будут квадраты соответствующих индексов.
 */

import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i * i;

        System.out.println("Массив с квадратами индексов:");
        System.out.println(Arrays.toString(arr));

    }
}
