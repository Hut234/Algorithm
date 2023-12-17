import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine());

        long start = 0, end = n;
        long mid = n/2;
        double tmp;
        while (start<=end) {
            tmp = Math.pow(mid, 2);
            if (tmp > n) {
                end = mid -1;
            } else if (tmp < n) {
                start = mid +1;
            } else {
                System.out.println(mid);
                return;
            }
            mid = (start+end) /2;
        }
        System.out.println(mid+1);
    }
}