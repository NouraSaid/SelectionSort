import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSelectionSort {

    public static void main(String args[]) {

        List<Integer> arrayToSort = new ArrayList<>();
        Collections.addAll(arrayToSort, 9, 14, 3, 2, 11, 22); // Initializing ArrayList

        System.out.println("Array before Sorting is : {9,14,3,2,11,22};");

        Integer sizeOfArrayToSort = arrayToSort.size(); // Getting size of ArrayList

        for (Integer i = 0; i < sizeOfArrayToSort - 1; i++) {
            Integer maxNumberIndex = i;

            // Find the index of the maximum element in the ArrayList
            for (Integer j = i + 1; j < sizeOfArrayToSort; j++) {
                if (arrayToSort.get(j).compareTo(arrayToSort.get(maxNumberIndex)) > 0) { // Using compareTo for comparison
                    maxNumberIndex = j;
                }
            }

            // Swap the maximum found with the first element of the ArrayList
            Collections.swap(arrayToSort, maxNumberIndex, i);
        }

        System.out.print("\nArray after Sorting is : ");
        for (Integer i = 0; i < sizeOfArrayToSort; i++) {
            System.out.print(arrayToSort.get(i) + "  "); // Print ArrayList After Sorting
        }
    }
}
