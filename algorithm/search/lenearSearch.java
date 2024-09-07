class linearSearch{
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 6;
        int result = linearSearch(arr,target);
        if(result == -1){
            System.out.println("Target does not exist in the array");
        }else{
            System.out.println("Target at index: "+result);
        }
    }

    static int linearSearch(int[] arr, int target){
        for(int i = 0 ;i< arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return  -1;
    }
}
