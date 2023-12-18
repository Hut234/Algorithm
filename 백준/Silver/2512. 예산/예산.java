import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] arr = new int[N];
        int sum = 0, tmp;
        for(int i=0; i<N; i++) {
            tmp = Integer.parseInt(s[i]);
            sum += tmp;
            arr[i] = tmp;
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        if(sum<=M) System.out.print(arr[N-1]);
        else{
            int start = 0, end = arr[N-1], mid = end/2;
            int max=0, tmp2;
            while(start<=end){
                tmp2 = 0;
                for(int i=0; i<N; i++){
                    if(arr[i]>mid) tmp2 += mid;
                    else tmp2 += arr[i];
                }
                if(tmp2>M) end = mid -1;
                else {
                    start = mid +1;
                    max = Integer.max(max, mid);
                }
                mid = (start+end) /2;
            }
            System.out.print(max);
        }
    }
}