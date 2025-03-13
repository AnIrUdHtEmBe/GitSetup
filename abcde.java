package Blind75;

import java.util.Arrays;

public class abcde {
    public static void main(String[] args) {
        int [] arr = {-11,33,-45,62,88,-95,111};
       sort_the_array(arr, 7);
           
        
    }
//     static int find_shortest_path(int i, int j) {
//         int steps = 0;

//         // Keep going up the tree until i equals j
//         while (i != j) {
//             if (i > j) {
//                 i = i / 2;  // Move node i up
//             } else {
//                 j = j / 2;  // Move node j up
//             }
//             steps++;  // Increment the step count each time
//         }
//         System.out.println(steps);

//         return steps;
    
// }



   static int[] sort_the_array(int[] arr, int n) {
        // Sort the array using absolute values
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}
