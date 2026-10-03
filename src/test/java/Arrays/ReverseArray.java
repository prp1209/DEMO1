package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void recursive_array(int[] arr, int start, int end)
    {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recursive_array(arr, start + 1, end - 1);
    }

    private static int[] readArrayValues(Scanner sc, int size)
    {
        int[] values = new int[size];
        System.out.println("Enter " + size + " elements (space or comma separated):");

        String line = sc.nextLine();
        String[] tokens = line.split("[\\s,]+" );

        if (tokens.length < size) {
            System.out.println("Not enough elements provided. Please enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                values[i] = sc.nextInt();
            }
            return values;
        }

        for (int i = 0; i < size; i++)
        {
            values[i] = Integer.parseInt(tokens[i]);
        }
        return values;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();

        int[] arr = readArrayValues(sc, size);

        System.out.println("Original array: " + Arrays.toString(arr));
        recursive_array(arr, 0, arr.length - 1);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        sc.close();
    }
}
