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

public class Recursion{
    public static int total(int a, int b){
       int sum = a+b;
       return sum;
    }
    public static void main(String[] args) {
        int a = 90;
        int b = 10;
        System.out.println("the sum of"+a+"+"+b+"is"+total(a, b));
    }
}