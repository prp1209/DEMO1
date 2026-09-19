package Arrays;

import java.util.Arrays;

public class Moving_0_Atlast {

    public static void moveZerosToEnd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arry = {0, 1, 2, 3, 4, 50, 8, 0, -1, 2, -5, 87};

        moveZerosToEnd(arry);

        System.out.println("Final result: " + Arrays.toString(arry));
    }
}
