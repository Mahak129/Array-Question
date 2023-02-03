import java.util.*;
public class Arrays{

    public static void LinearSearch(int key,int numbers[]){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]== key){
                System.out.println("the key is at index = "+ i);
                return;
            }

        }
                          System.out.println("the key is not present");

    }

    public static void StringSearch(String ki, String arr[]){
        for(int i =0; i< arr.length; i++){
            if(arr[i] == ki){
                System.out.println("the key is at index = "+ i);
                return;
            }
        }
        System.out.println("key not found");
    }


    public static int largestInArray(int numbers[]){
        int largest = Integer.MIN_VALUE;-infinity
        int smallest = Integer.MAX_VALUE;+infinity
        for(int i =0 ; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest numbers is "+ smallest);
        return largest;
    }
    public static void main(String args[]){
//    int marks[] = new int[100];
//    Scanner sc = new Scanner(System.in);
//    marks[0]= sc.nextInt();
//     marks[1]= sc.nextInt();
//      marks[2]= sc.nextInt();
//      System.out.println(marks[0]+" = phy");
//          System.out.println(marks[1]+" = phy");
//              System.out.println(marks[2]+" = phy");

int numbers[] = {3,7,6,1};
int key =100;

// LinearSearch(key, numbers);

String arr[]={"Apple", "Banana","Orange"};
String ki ="Banana";
// StringSearch(ki,arr);

System.out.println(largestInArray(numbers));
    }
}