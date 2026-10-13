package Arrays;

import java.util.Arrays;

public class Array_Practice1 {
//    Write a java program to move all zero at the end of array
//    {0,0,1,2,0,8,0,7,5,6,0,3}


    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 2, 0, 8, 0, 7, 5, 6, 0, 3};

        int[] result = new int[arr.length];   // all zeros to start
        int index = 0;

        for (int a : arr) {
            if (a != 0) {
                result[index] = a;   // put non-zero at the next free spot
                index++;
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
