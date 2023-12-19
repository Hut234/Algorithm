import java.util.Arrays;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        int[] arr = new int[N];
        String[] s2 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s2[i]);
        }
        Arrays.sort(arr);
        int[] start = new int[M];
        int[] end = new int[M];
        for (int i = 0; i < M; i++) {
            s2 = br.readLine().split(" ");
            start[i] = Integer.parseInt(s2[0]);
            end[i] = Integer.parseInt(s2[1]);
        }
        int s, e, mid, i, j;
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<M; k++) {
            s = 0;
            i = N;
            e = N -1;
            mid = e /2;
            while (s <= e) {
                if (start[k] <= arr[mid]) {
                    i = Integer.min(i, mid);
                    e = mid -1;
                }
                else s = mid +1;
                mid = (s+e) /2;
            }
            s = 0;
            j = -1;
            e = N -1;
            mid = e /2;
            while (s <= e) {
                if (end[k] >= arr[mid]) {
                    j = Integer.max(j, mid);
                    s = mid +1;
                }
                else e = mid -1;
                mid = (s+e) /2;
            }
            sb.append(j-i+1).append("\n");
        }
        System.out.print(sb);
    }
}