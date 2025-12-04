import java.util.*;

public class Main {

    static ArrayList<Long> answer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            dfs(i, i);
        }

        if (N >= answer.size()) {
            System.out.println(-1);
            return;
        }

        Collections.sort(answer);
        System.out.println(answer.get(N));
    }

    static void dfs(long num, int lastDigit) {
        answer.add(num);

        for (int next = 0; next < lastDigit; next++) {
            dfs(num * 10 + next, next);
        }
    }
}