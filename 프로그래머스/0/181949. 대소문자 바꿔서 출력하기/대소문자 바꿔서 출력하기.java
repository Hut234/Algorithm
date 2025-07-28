import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        int len = chars.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = chars[i];
            if (c > 90) sb.append((char) (c - 32));
            else sb.append((char) (c + 32));
        }
        System.out.print(sb);
    }
}