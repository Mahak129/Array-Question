public class printSubArray{
    public static void PrintSubArray(int arr[]){
        int  total_subArray =0;
        for(int i =0;i<arr.length;i++){
            for(int j =i; j<arr.length;j++){
                for(int k =i; k<=j ;k++){
                    System.out.print(arr[k]+" ");
                  
                }
                  total_subArray++;
                System.out.println();
            }
             System.out.println();
        }
          System.out.println(total_subArray);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8};
         PrintSubArray(arr);
    }
}