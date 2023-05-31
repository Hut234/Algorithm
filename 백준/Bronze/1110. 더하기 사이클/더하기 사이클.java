import java.io.*;
class Main{
    public static void main(String[] a) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        //N과 비교할 숫자
        int newN = N;
        boolean flag = false;
        int cnt = 0;
        while(!flag){
            //새로운 수를 만드는 과정
            int sum = newN/10 + newN%10;
            //newN%10*10 = 26의 6을 앞으로 보내는 과정
            //sum%10 = 새로운 수의 일의 자리를 뽑아내는 과정
            newN = newN%10*10 + sum%10;
            if(newN==N) flag = true;
            cnt++;
        }
        System.out.print(cnt);
    }    
}