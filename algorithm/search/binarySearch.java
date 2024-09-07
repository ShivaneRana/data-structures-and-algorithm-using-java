class binarySearch{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 5;
        System.out.println(binarySearch(arr,target));
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(end >= start){
            int middle = end - start / 2;
            if(arr[middle] == target){
                return middle;
            }else if(arr[middle] < target){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return -1;
    }
}
