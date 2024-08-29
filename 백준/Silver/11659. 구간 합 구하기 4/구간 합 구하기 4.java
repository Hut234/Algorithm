import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[] nums = new int[N+1];
        String[] numStr = br.readLine().split(" ");
        for(int i=0; i<N; i++) {
            nums[i+1] = nums[i] + Integer.parseInt(numStr[i]);
        }

        StringBuilder sb = new StringBuilder();
        while(M-->0) {
            String[] ij = br.readLine().split(" ");
            int i = Integer.parseInt(ij[0]);
            int j = Integer.parseInt(ij[1]);
            sb.append(nums[j]-nums[i-1]).append("\n");
        }
        System.out.print(sb);
    }
}