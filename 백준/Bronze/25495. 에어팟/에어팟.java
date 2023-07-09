import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int result = 0, val, prev=0, prevAmount=0;
        for(int i=0; i<N; i++) {
            val = Integer.parseInt(input[i]);
            //1. 이전 휴대폰이랑 지금 휴대폰이랑 같은지 비교
            if(val == prev) {//같으면 이전 소모량 곱하기 두배해서 더하기
                prevAmount *= 2;
                result += prevAmount;
            } else {//다르면 2를 더하기
                prevAmount = 2;
                result += 2;
            }
            
            if(result >= 100) {//result 총배터리 사용량이 100을 넘으면 완충하고 진행
                prev = 0;
                result = 0;
            } else {//안 넘으면 누적해서 더하기.
                prev = val;
            }
        }
        System.out.print(result);
    }
}