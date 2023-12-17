import java.util.*;
class Main{
    public static void main(String[] args){
        int N = new Scanner(System.in).nextInt();
        int tmp;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(sum(i)==N) list.add(i);
        }

        if(list.size()>0){
            Collections.sort(list);
            System.out.print(list.get(0));
        } else {
            System.out.print(0);
        }
    }

    static int sum(int i){
        int result = i;
        int tmp = i;
        while(tmp!=0){
            result += tmp%10;
            tmp /= 10;
        }
        return result;
    }
}