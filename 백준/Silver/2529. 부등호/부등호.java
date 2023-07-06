import java.io.*;
import java.util.*;
class Main{
    static List<Integer> list = new ArrayList<>();
    static List<String> result = new ArrayList<>();
    static String[] signs;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        signs = br.readLine().split(" ");
        recur(0, K+1); //숫자의 개수 : 부등호 +1
        System.out.println(result.get(result.size()-1));
        System.out.println(result.get(0));
    }
    private static void recur(int start, int end) {
        if(start == end){
            //K = 2라면 -> end가 3이자나요 3일 때 멈춰야함.
            boolean flag = true;
            for(int i=0; i<signs.length; i++){
                //나는 지금 sign으로 비교할거야 
                //어떻게? sign기준으로 왼쪽 오른쪽 숫자를 비교하면 됨.
                if(signs[i].equals("<")) {
                    if(list.get(i)<list.get(i+1)) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                      if(list.get(i)>list.get(i+1)) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                }
            } 
            if(flag) {
                Iterator<Integer> iter = list.iterator();
                StringBuilder sb = new StringBuilder();
                while(iter.hasNext()) {
                    sb.append(iter.next());
                }
                result.add(sb.toString());  
            }
            return;
        }
        for(int i=0; i<=9; i++){
            if(list.contains(i)) {
                continue;
            }
            list.add(i);
            recur(start+1, end);
            list.remove(list.indexOf(i));
        }
    }
}