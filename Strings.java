

// public class Strings {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter any number you want to be reversed");
//         String user = sc.nextLine();
//         StringBuilder sb = new StringBuilder(user); 
//         System.out.println(sb);
//         for(int i=0; i<sb.length()/2 ; i++){
//             int front = i;
//             int back = sb.length()-1-i;

//             char frontWord = sb.charAt(front);
//             char backWord = sb.charAt(back);

//             sb.setCharAt(front,backWord);
//             sb.setCharAt(back,frontWord);

//         }
//         System.out.println("your reversed string is: "+sb);
//         if (user.equals(sb)) {
//             System.out.println("this string is plaindrome");
//         }else{
//             System.out.println("this string is not plaindorme");
//         }

//     }
// }

// import java.util.*;

// public class Strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your string");
//         String User = sc.nextLine();
//         StringBuilder sb = new StringBuilder(User);
//         for (int i = 0; i <= sb.length() / 2; i++) {
//             int First = i;
//             int Last = sb.length() - i - 1;

//             char FirstWord = sb.charAt(First);
//             char LastWord = sb.charAt(Last);

//             sb.setCharAt(First, LastWord);
//             sb.setCharAt(Last, FirstWord);

//         }

//         System.out.println(sb);
//         if (User.equals(sb.toString())) {
//             System.out.println("this string is palindrome");
//         } else {
//             System.out.println("this string is not palindrome");
//         }

//     }
// }
//Anagrame

import java.util.Arrays;

public class Strings{
    public static void main(String[] args) {
        String Str1 = "brag",Str2 = "grab";
        if(Str1.length() != Str2.length()){
            System.out.println("these strings are not anagrame");
        }
        else{
            char[] word1 = Str1.toCharArray();
            char[] word2 = Str2.toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);
            if(Arrays.equals(word1, word2)){
                System.out.println("these strings are anagrame");
            }
            else{
                System.out.println("these string are not anagrame ");
            }
        }
    }
}