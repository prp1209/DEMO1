package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Array_practice02 {
               public static void main(String[] args) {
               int[] arr = {2, 3, 4, 2, 3};
//
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : arr) {
//            if (set.contains(num)) {
//                set.remove(num);
//            } else {
//                set.add(num);
//            }
//        }
//
//        System.out.println("Element appearing exactly once: " + set.iterator().next());


//    Apprpach 2

    for(int i=0;i<arr.length;i++) {
        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;

            }
        }

        if(count==1){
            System.out.println(arr[i]);
            break;
        }
    }

}
}
