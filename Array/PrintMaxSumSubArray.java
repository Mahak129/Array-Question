import java.util.*;
public class PrintMaxSumSubArray{
      public static void subarraysum(int arr[]){
       
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i= 0;i<arr.length;i++){
            // int start = i;
            for(int j =i ;j<arr.length;j++){
                // int end =j;
                currSum=0;
                for(int k = i; k<=j ; k++){
                
                 currSum += arr[k];
                }
                     System.out.println(currSum);
                 if(maxSum < currSum){
                    maxSum=currSum;
                 }
             
            }
           
        }
         
           System.out.println("max sum = "+maxSum); 
      }
    public static void main(String args[]){
int arr[] ={2,4,6,8,10};
subarraysum(arr);

    }
}