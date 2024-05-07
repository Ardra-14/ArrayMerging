import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int size1 = s.nextInt();

        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++){
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter the size of the second array: ");
        int size2 = s.nextInt();


        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i<size2; i++){
            arr2[i] = s.nextInt();
        }


        Merging m = new Merging();
        Integer[] mergedArray = m.combinedArrays(arr1, arr2);
        Arrays.sort(mergedArray, Collections.reverseOrder());
        System.out.println("Descending order of the merged array is : "+ Arrays.toString(mergedArray));
    }
}