class selectionSort{
    public static void main(String[] args){

        int[] arr = {5,2,1,4,3,2,32,565,7,678,8576,8,768,567,536,75674};
        System.out.println("Before Sort~");
        for(int i: arr){
            System.out.print(i+" ");
        }

        selection(arr);

        System.out.println();
        System.out.println("After Sort~");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    static void selection(int[] arr){
        for(int i = 0;i< arr.length;i++){
            int minindex = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }
}