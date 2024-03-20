public class ReverseSelectionSort {

    public static void main(String args[]) {

        int sizeOfArrayToSort = 6; //set array size
        int arrayToSort[] = {9, 14, 3, 2, 11, 22}; //add elements to Array

        System.out.println("Array before Sorting is : {9,14,3,2,11,22};");

        for (int i = 0; i < sizeOfArrayToSort - 1; i++) {
            int maxNumberIndex= i;

            // Find the index of the maximum  element in the Array
            for (int j = i + 1; j < sizeOfArrayToSort; j++) {
                if (arrayToSort[j] > arrayToSort[maxNumberIndex]) //to 
{
                    maxNumberIndex= j;
                }
            }

            // Swap the maximum  found with the first element of the Array
            int temp = arrayToSort[maxNumberIndex];
            arrayToSort[maxNumberIndex] = arrayToSort[i];
            arrayToSort[i] = temp;
        }

        System.out.print("\nArray after Sorting is : ");
        for (int i = 0; i < sizeOfArrayToSort; i++) {
            System.out.print(arrayToSort[i] + "  "); //Print Array After Sorting
        }
    } }