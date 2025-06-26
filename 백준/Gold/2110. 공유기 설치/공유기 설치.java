import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int n;
    static int[] houses;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = sc.nextInt();

        houses = new int[n];
        for (int i = 0; i < n; i++) houses[i] = sc.nextInt();
        Arrays.sort(houses);

        int start = 1, end = houses[n - 1] - houses[0];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (count(mid) >= c) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.print(end);
        sc.close();
    }

    public static int count(int diff) {
        int before = houses[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (houses[i] - before >= diff) {
                before = houses[i];
                count++;
            }
        }
        return count;
    }
}