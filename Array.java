// public class Array {
//     public static void main(String args[]){

//         int Marks[] = {40,24,34,45,56};
//         for(int i = 0 ; i<2; i++ ){
//         System.out.println(Marks[i]);
//         }
//     } 
// }
// public class Array {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int Size = sc.nextInt();
//         int value[] = new int[Size];
//         for (int i = 0; i < Size; i++) {
//             value[i] = sc.nextInt();
//         }
//         System.out.println("enter your number to be find:");
//         int x = sc.nextInt();
//         for (int i = 0; i < value.length; i++) {
//             if(x == value[i]){
//             System.out.println("your number found at : " +i);
//             }else{
//                 System.out.println("this number is not in this array");
//             }
//         }
//     }
// }
// import java.util.*;
// public class Array{
//     public static void main (String args[]){
//         int List[] ={12,12,65,15,6161,231,6454,113,4649,16,446,65446};
// Scanner sc= new Scanner(System.in);
// System.out.println("enter your number to be find:");
// int a = sc.nextInt();
//         for (int i=0 ; i<List.length ; i++){
//             if(a == List[i] ){
//                 System.out.println("your number is found at:"+i);
//             }
//         }
//     }
// }
// public class Array{
// 2d array linear searching
// public class Array{
// public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println("enter number of rows");
//     int row = sc.nextInt();
//     System.out.println("enter number of cols");
//     int col = sc.nextInt();
//     int Matrix[][] = new int[row][col];
//     for(int i=0 ; i<row ; i++){
//         for(int j=0 ; j<col ; j++){
//             System.out.println("enter your number");
//             Matrix[i][j] = sc.nextInt(); 
//         }
//         System.out.println("create row number"+i+1);
//     }
//     System.out.println("enter your number you want to find ");
//     int num = sc.nextInt(); 
//     System.out.println("your 2d array will be:");
//     for(int i=0 ; i<row ; i++){
//         for(int j=0; j<col; j++  ){
//     System.out.print(Matrix[i][j]+" ");
//         }
//         System.out.println();
//     }
//     for(int i=0; i<row; i++){
//         for(int j =0; j<col ; j++){
//             if(Matrix[i][j] == num){
//                 System.out.println("your number is found at index :("+i+","+j+")");
//             }
//         }
//     }
// }
// }
//remove duplicate
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of array your want");
//         int user = sc.nextInt();
//         int Arr[]=new int[user];
//         System.out.println("Enter your array values");
//         for(int i =0; i<user ; i++){
//             Arr[i] = sc.nextInt(); 
//         }
//         for(int i=0; i<user; i++){
//             for(int j=i+1; j<user; j++ ){
//             if(Arr[i] == Arr[j]){
//                 System.out.println(Arr[i]+"is the duplicate number in this array   ");
//             }
//         }
//     }
//         System.out.println();
//     }
// }
//merge sorted array
// public class Array {
//     public static void main(String args[]) {
//         int A[] = {1, 2, 3, 4, 5};
//         int B[] = {6, 7, 8, 9, 0};
//         int a = A.length;
//         int b = B.length;
//         int c = a + b;
//         int C[] = new int[c];
//         for(int i = 0; i<a; i++){
//             C[i] = A[i];
//         }
//         for(int i = 0 ; i<b ; i++){
//             C[a+i] = B[i];
//         }
//         for(int i=0; i<c; i++){
//             System.out.print(C[i] +" " );
//         }
//     }
// }
// search a number in array

public class Array{
    public static void main(String[] args) {
        int A[] = {12,5,14,19,18,4,51,45};
        int find = 51;
        for(int i = 0 ; i<A.length;i++){
            if(A[i] == find){
                System.out.println("the number is found at"+i);
            }
        } 
    }
}

