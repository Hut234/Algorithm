import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(n).append(" ").append(n%2 == 0 ? "is even" : "is odd");
        System.out.print(sb);
    }
}