//         for ( int i = 0 ; i <= 5 ; i = i + 1 ){
//             for ( int j = 0 ; j <= 5; j = j + 1){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//border rectangle 
// public class Pattern {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Number of row you want"); 
//         int a = sc.nextInt();
//         System.out.println("number of columns you want");
//         int b = sc.nextInt();

//         for (int  i = 1 ; i <=a ; i++){
//             for (int  j = 1 ; j <=b ; j++){
//                 if(i == 1 || j==1 || i==a || j==b){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//             System.out.println();
//         }
//     }
// }
//half triangle
// public class Pattern {
//     public static void main(String args[]){
//         int n = 5;
//         // int m = 5;
//         for(int i = 0; i <= n ; i++){
//             for (int j=1 ; j<=i ; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }
//inverted half triangle
// public class Pattern {
//     public static void main(String args[]){
//         int n = 5;
//         // int m = 5;
//         for(int i = n; i >= 0 ; i--){
//             for (int j=1 ; j<=i ; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }
//half rotated triangle 
// public class Pattern {
//     public static void main(String args[]){
//         int n = 5;
//         // int m = 5;
//         for(int i = 1; i <= n ; i++){
//             for (int j=1 ; j<=n-i ; j++ ){
//                 System.out.print(" ");
//             }
//             for(int j=1 ; j<=i ; j++  ){
//                 System.out.print("*");
//             }

//             System.out.println();

//         }
//     }
// }
// half pyramid with numbers
// public class Pattern {
//     public static void main(String args[]){
//         int n = 5;
//         // int m = 5;
//         for(int i = 0; i <= n ; i++){
//             for (int j=1 ; j<=i ; j++ ){
//                 System.out.print(j);
//             }
//             System.out.println();

//         }
//     }
// }
//half inverted pyramid with numbers
// public class Pattern{
//     public static void main(String args[]){
//         int n = 5;
//         for (int i = n ; i>=0 ; i-- ){
//             for(int j = 1 ; j<=i ; j++  ){
//                 System.out.print(j);
//             }
//             System.out.println();
//         } 
//     }
// }
//half triangle with increase numbers
// public class Pattern{
//     public static void main(String args[]){
//         int n = 5;
//         int value = 1;
//         for (int i = 1 ; i<=n ; i++ ){
//             for(int j = 1 ; j<=i ; j++  ){
//                 System.out.print(value);
//                 value++;
//             }
//             System.out.println();
//         } 
//     }
// }
// butterfly pattern
// public class Pattern {
//     public static void main(String args[]){
//         int a = 5; 
//         for(int i=1; i<=a ; i++){
//             for(int j=1; j<=i ; j++){
//                 System.out.print("*");
//             }

//             int spaces = 2*(a-i);
//             for(int j=1; j<=spaces ; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=a; i>=1 ; i--){
//             for(int j=1; j<=i ; j++){
//                 System.out.print("*");
//             }

//             int spaces = 2*(a-i);
//             for(int j=1; j<=spaces ; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// solid rhombus
// public class Pattern {
//     public static void main (String args[]){
//         int a = 5;
//         for (int i =1 ; i<=a; i++){
//             for(int j=1; j<=a-i ; j++){
//             System.out.print(" ");
//             }
//             for (int j=1; j<=a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
public class Pattern {
    public static void main(String args[]) {
        int a = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                if (i == 1 || j == 1 || i == a || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}