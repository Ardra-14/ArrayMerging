public class Merging {
    public  Integer[] combinedArrays(int[] arr1, int[] arr2){
        Integer[] combinedArray = new Integer[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++){
            combinedArray[j] = arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++){
            combinedArray[j] = arr2[i];
            j++;
        }
        return combinedArray;
    }
}


