//bubble sort

// public class Sorting {
//     public static void Sort(int Arr[]) {
//         for (int i = 0; i <Arr.length; i++) {
//             System.out.print(Arr[i] + " ");
//         }System.out.println();
//     }
//     public static void main(String args[]){
//         int Arr[] = {7,4,8,3,1,0};
//         for (int i = 0; i<Arr.length-1; i++){
//             for(int j=0 ; j<Arr.length-i-1; j++){
//                 if(Arr[j] > Arr[j+1]){
//                     int Temp = Arr[j];
//                     Arr[j] = Arr[j+1];
//                     Arr[j+1] = Temp;
//                 }
//             }
//         }
//         Sort(Arr);
//     }
// }
//  selection sort
// public class Sorting{
//     public static void Sort(int arr[]){
//         for(int i =0; i<arr.length ; i++){
//             System.out.print(arr[i] +" ");
//         }System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {7,4,8,3,1,0};
//         for(int i=0 ; i<arr.length; i++ ){
//             int smallest = i;
//             for(int j=i+1; j<arr.length ; j++){
//                 if(arr[smallest] > arr[j]){
//                     smallest = j;
//                 }
//                 int temp = arr[smallest];
//                 arr[smallest] = arr[i];
//                 arr[i] = temp  ;
//             }
//         }
//         Sort(arr);
//     }
// } 
import java.util.Scanner;

public class Sorting {

    public static void Sorted(int Unsort[]) {
        System.out.println("this is your sorted array");
        for (int i = 0; i <Unsort.length; i++) {
            System.out.print(Unsort[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length for you array");
        int user = sc.nextInt();
        int Unsort[] = new int[user];
        System.out.println("enter the number in your array");
        for (int i = 0; i < user; i++) {
            Unsort[i] = sc.nextInt();
        }
        
        for (int i = 0; i <user - 1; i++) {
            for (int j = 0; j< user - i - 1; j++) {
                if (Unsort[j] > Unsort[j + 1]) {
                    int temp = Unsort[j];
                    Unsort[j] = Unsort[j + 1];
                    Unsort[j + 1] = temp;
                }
            }
            Sorted(Unsort);
        }
    }
}
