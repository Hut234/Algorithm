import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] expensePlans = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            expensePlans[i] = Integer.parseInt(br.readLine());
            max = Integer.max(max, expensePlans[i]);
        }

        int start = 1, end = max * N;
        int answer = end + 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int withdrawCount = countWithdraw(expensePlans, mid);
            if (withdrawCount > M) start = mid + 1;
            else {
                answer = mid;
                end = mid - 1;
            }
        }
        System.out.print(answer);
    }

    private static int countWithdraw(int[] expensePlans, int mid) {
        int currentMoney = mid;
        int count = 1;
        for (int expensePlan : expensePlans) {
            if (mid < expensePlan) return expensePlans.length + 1;
            if (currentMoney < expensePlan) {
                count++;
                currentMoney = mid - expensePlan;
            }
            else currentMoney -= expensePlan;
        }
        return count;
    }
}
