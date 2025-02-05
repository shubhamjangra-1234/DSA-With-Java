
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your number");
//         int N = sc.nextInt();
//         int Factorial = 1;
//         for(int i=N; i>=1 ; i--){
//             Factorial = Factorial*i;
//         }
//         System.out.println("the factorial of :"+N+"is"+Factorial);
//     } 
// }
// smallest and largest number 

// public class Prep {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("matrix.length of array you want");
//         intmatrix.length = sc.nextInt();
//         int matrix[] = new int[matrix.length];
//         for (int i = 0; i <matrix.length; i++) {
//             System.out.println("enter a number");
//             matrix[i] = sc.nextInt();
//         }
//         int Min = Integer.MAX_VALUE;
//         int Max = Integer.MIN_VALUE;
//         for (int i = 0; i <matrix.length; i++) {
//             if (matrix[i] > Max) {
//                 Max = matrix[i];
//             }
//             if (matrix[i] < Min) {
//                 Min = matrix[i];
//             }

//         }
//         System.out.println("Smallest number is :" + Min);
//         System.out.println("Largest Number is :" + Max);

//     }
// }
// palindrome
import java.util.*;

public class Prep {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String User = sc.nextLine();
        StringBuilder sb = new StringBuilder(User);
        System.out.println(sb);

        for (int i = 0; i<sb.length()/2; i++) {
            int first = i;
            int last = sb.length()-1-i;

            char FirstWord = sb.charAt(first);
            char LastWord = sb.charAt(last);

            sb.setCharAt(first,FirstWord);
            sb.setCharAt(last,LastWord);
            System.out.println("your reversed string is :"+sb);
        }


    }
}
