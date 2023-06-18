import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N, max;
        while(T-->0){
            max = -1;
            N = Integer.parseInt(br.readLine());
            String[] univ = new String[N];
            int[] arr = new int[N];
            int idx=-1;
            for(int i=0; i<N; i++){
                String[] input = br.readLine().split(" ");
                univ[i] = input[0];
                arr[i] = Integer.parseInt(input[1]);
                if(max<arr[i]) {
                    max = arr[i];
                    idx = i;
                }                
            }
            System.out.println(univ[idx]);
        }
    }
}