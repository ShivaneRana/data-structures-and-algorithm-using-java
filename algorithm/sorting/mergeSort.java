class mergeSort{
    public static void main(String[] args){

        int[] arr = {5,2,1,4,3};
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
        if(lenght <= 1) return;

        int middle = lenght/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[lenght - middle];
        for(int i = 0;i < middle;i++){
            leftArray[i] = arr[i];
        }

        for(int j = middle; j < lenght;j++){
            rightArray[j - middle] = arr[j];
        }

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

        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < leftLength){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightLength){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}