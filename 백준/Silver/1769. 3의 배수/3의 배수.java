import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, cnt = 1, sum = 0, last = -1;
        while((a = br.read() - '0') >= 0 ) {
            sum += a;
            last = a;
        }
        //더하기 연산이 안 일어났으므로 0으로 출력하기 위해 sum과 last 입력받은 숫자를 비교함.
        if(sum==last) {
            System.out.println(0);
            System.out.println(sum%3==0 ? "YES" : "NO");
            return;
        }
        
        while(sum/10 != 0) {
            cnt++;
            sum = sumMethod(sum);
        }
        System.out.println(cnt);
        System.out.print(sum%3==0 ? "YES" : "NO");
    }
    private static int sumMethod(int val) {
        int result = val%10, tmp, quot = val/10;
        while(quot != 0) {
            tmp = quot%10;
            result += tmp;
            quot /= 10;
        }
        return result;
    }
}