//         System.out.println(name);
//         return;
//     } 
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         Calc(name);
//     }
// }
// public class Functions{
//     public static int Calc(int a, int b ){
//         int sum = a*b;
//         return sum;
//     }
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ist number");
//         int a = sc.nextInt();
//         System.out.println("2nd number");
//         int b = sc.nextInt();
//         System.out.print("Sum:");
//         System.out.print(Calc(a, b));
//     }
// }
//factorial
// public class Functions{
//     public static void Factorial(int a){
//         int Factor = 1;
//         for(int i=a; i>=1; i--){
//              Factor = Factor*i; 
//         }
//         System.out.println(Factor);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         Factorial(a);
//     }
// }
import java.util.*;

public class Functions {
    public static void Calc(int a) {
        int Factor = 1;
        for (int i = a; i >= 1; i--) {
            Factor = Factor * i;
        }
        System.out.println(Factor);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Calc(a);
    }
}