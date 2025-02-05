import java.util.*;
// public class Practice {
// public static int Average(int a, int b, int c) {
// int avg = a+b+c/3;
// return avg;
// }
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// System.out.println(Average(a,b,c));

// }
// }
//all odd number to n numbers
// public class Practice{
//     public static void odd(int a){
//         for(int i = 1; i<=a; i++){
//             if(i%2 != 0){
//                 System.out.println(i+" ");
//             }

//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         odd(a);
//         System.out.println("Here are all odd numbers ");

//     }
// }
//sum if all odd numbers
// public class Practice{
//     public static void odd(int a){
//         int sum = 0;
//         for(int i = 1; i<=a; i++){
//             if(i%2 != 0){
//             sum += i;
//             }

//         }
//         System.out.println("the total of all odd numbers between this number are:"+sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter any random number:");
//         int a = sc.nextInt();
//         odd(a);

//     }
// }
// find greater btw 2 numbers
// public class Practice{
//     public static void Greater(int a , int b){
//         if (a<b){
//             System.out.println(b+"is greater number");
//         }
//         else if(a ==b){
//             System.out.println("both numbers are equal");
//         }
//         else{
//             System.out.println(a+"is greater number");
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter ist number ");
//         int a = sc.nextInt();
//         System.out.println("enter 2nd number");
//         int b = sc.nextInt();

//         Greater(a,b);

//     }
// }
//circumference  of circle with radius
// public class Practice{
//     public static double Circle(int r) {
//         // int pi = 22/7;
//         double circumference = 2*Math.PI*r;

//         return circumference;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         System.out.print("The circumference of radius" + r+ "is"+Circle(r));
//         // System.out.println(circumference);

//     }
// } 
//infinite loop
// public class Practice{
//     public static void main(String args[]){
//         int num = 1;
//         do { 
//             System.out.println("count is ");
//         } while (num<=num++);
//     }
// }
//number of negative,positive and zeroes till user
// public class Practice{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int negative = 0;
//     int positive = 0;
//     int zero = 0;
//     char choose;

//     do { 
//         System.out.println("enter any random number:");
//         int a = sc.nextInt();
//         if(a>0){
//             positive++;
//         }
//         else if (a<0){
//         negative++;}
//         else{
//             zero++;
//         }
//         System.out.println("wanna add another number (y/n)?:");
//         choose = sc.next().charAt(0);
//     } while (choose == 'y');

//     System.out.println("Conclusion");
//     System.out.println("number of positive numbers are"+positive);
//     System.out.println("number of negatives are"+negative);
//     System.out.println("number of zeroes are"+zero);
//   }
// }
// x^n
// public class Practice{
//     public static double Exponent(int x, int n ){
//         double value = Math.pow(x,n);
//         return value;
//     } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the base value");
//         int x = sc.nextInt();
//         System.out.println("enter its power");
//         int n = sc.nextInt();

//         System.out.println("The value of "+x+ "with power of" +n+ "is" +Exponent(x,n) );

//     }
// }
//                       Arrays
// public class Practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your array size:");
//         int size = sc.nextInt();
//         String Names[] = new String[size];
//         for (int i = 0; i < Names.length; i++) {
//             Names[i] = sc.next();
//         }
//         System.out.println("array content:");
//         for (int i = 0; i < Names.length; i++) {

//             System.out.println(+i + Names[i]);
//         }
//     }
// }
// maximum and minimum

// public class Practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your array size:");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         System.out.println("enter you number in this array");
//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] = sc.nextInt();
//         }
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] < min) {
//                 min = numbers[i];
//             }
//             if (numbers[i] > max) {
//                 max = numbers[i];
//             }
//         }
//         System.out.println("The largest number is " + max);
//         System.out.println("The smallest number is " + min);

//     }
// }
// check array is sorted or not

// public class Practice{
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("enter your array size:");
//              int size = sc.nextInt();
//              int numbers[] = new int[size];
//              System.out.println("enter you number in this array");
//              for (int i = 0; i < numbers.length; i++) {
//                  numbers[i] = sc.nextInt();
//              }

//              Boolean ascending = true;

//              for(int i=0 ; i<numbers.length-1 ; i++){
//                 if(numbers[i] > numbers[i+1]){
//                     ascending = false;
//                 }
//                 System.out.println(numbers[i]);
//             }
//             if(ascending){
//                 System.out.println("this array is sorted in increasing order");
                
//             }
//             else{
//                 System.out.println("this array is not sorted");
//             }
//     }
// }