// public class Recursion{
//     public static void Number(int num){
//         if(num ==6){
//             return;
//         }
//         System.out.println(num);
//         Number( num+1);
//     }
//     public static void main(String args[]){
//         int num =1;
//         Number(num);
//     }
// }

// public class Recursion{
//     public static void Number(int  num){
//         if(num == 100 ){
//             return;
//         }
//         System.out.println(num);
//         Number(num+1);
//     }
//     public static void main(String args[]){
//         int num = 0;
//         Number(num);
//     }
// } 
//print sum if n natural numbers
// public class Recursion{
//     public static void Number(int a , int b, int Sum){
//         if(a == b){
//             Sum += a;
//             System.out.println(Sum);
//             return;
//         }
//         Sum += a;
//         Number(a+1 , b , Sum);
//     }
//     public static void main(String[] args) {
//         Number(0, 50, 0);
//     }

// }
//print factorial of n numbers
// public class Recursion{
//     public static int Factor(int n){
//         if (n == 0 || n == 1 ){
//             return 1;
//         }
//         int a = Factor(n-1);
//         int b = n*a;
//         return b;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(Factor(n));
//     }
// }
// public class Recursion{
//     public static int Factor(int n ){
//         if(n==1){
//             return 1;
//         }
//         int a = Factor(n-1);
//         int b = a * n;
//         return b ;
//     }
//     public static void main(String args[]){
//         int n = 40;
//         System.out.println(Factor(4));
//     }
// }
public class Recursion{
    public static int Factor(int n ){
        if( n == 1){
            return 1;
        }
        int A = Factor(n-1);
        int B = n*A;
        
        return B;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print( Factor(n));
        
    }
}