class insertionSort{
    public static void main(String[] args) {

        int[] arr = {5,2,1,4,3,2,32,565,7,678,8576,8,768,567,536,75674};
        System.out.println("Before Sort~");
        for(int i: arr){
            System.out.print(i+" ");
        }

        insertion(arr);

        System.out.println();
        System.out.println("After Sort~");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void insertion(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}