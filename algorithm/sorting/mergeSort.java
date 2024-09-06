class mergeSort{
    public static void main(String[] args){

        int[] arr = {5,2,1,4,3,2,32,565,7,678,8576,8,768,567,536,75674};
        System.out.println("Before Sort~");
        for(int i: arr){
            System.out.print(i+" ");
        }

        mergeSort(arr);

        System.out.println();
        System.out.println("After Sort~");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    static void mergeSort(int[] arr){
        int lenght = arr.length;

        // run until there are only one element remaining in each array
        // when an array has only one element left it is considred sorted
        if(lenght <= 1) return;

        int middle = lenght/2;

        // create new arry for left and right side
        int[] leftArray = new int[middle];
        int[] rightArray = new int[lenght - middle];

        // assign value to them
        for(int i = 0;i < middle;i++){
            leftArray[i] = arr[i];
        }

        for(int j = middle; j < lenght;j++){
            rightArray[j - middle] = arr[j];
        }

        // recurstion
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(arr,leftArray,rightArray);

    }

    // this is a helper method
    static void merge(int[] arr, int[] leftArray, int[] rightArray){
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int length = arr.length;
        int i = 0; // count indices of left Array
        int j = 0; // count indices of rigth Array
        int k = 0; // count indices of Array

        // this keeps running until all value in the left and right array has been checked
        while(i < leftLength && j < rightLength){
            // if left array value is less than right array insert it into array,
            // the reason we can insert it directly is because the value being checked are already sorted
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            // increment k place to store new value after each assignment in new index
            k++;
        }

        // if there is any value left after merging this insert it into the array
        while(i < leftLength){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // if there is any value left after merging this insert it into the array
        while(j < rightLength){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}