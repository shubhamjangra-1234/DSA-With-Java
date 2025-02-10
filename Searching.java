//linear searching
// public class Searching{
//     public static void main(String args[]){
//         int[] Arr = {12,15,15,1,1,61,584,16,18,41,51,6,81};
//         for(int i = 0 ; i<Arr.length ; i++){
//             if(Arr[i] == 16){
//                 System.out.println("your number is found at index"+i);
//             }
//         }

//     }
// }
//binary searching
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("this is your array") ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" ");
        }System.out.println();
        System.out.println("enter any number you want to search in this array");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int result = search(arr, key);
        System.out.println("your number" + key + "is found at index :" + result);
    }

    public static int search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                if (arr[mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
