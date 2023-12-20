import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        StringBuilder str = new StringBuilder();
        for (char c : arr) {
            if (c > 90) {
                c = (char)(c-32);
            } else {
                c = (char)(c+32);
            }
            str.append(c);
        }
        System.out.println(str.toString());
    }
}