import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        String[] s;
        int tot, cur;
        while(N-->0){
            s = sc.nextLine().split("");
            tot = cur = 0;
            for(int i=0; i<s.length; i++) {
                if(s[i].equals("X")) cur = 0;
                else {
                    cur++;
                    tot += cur;
                }
            }
            sb.append(tot).append("\n");
        }
        System.out.print(sb);        
    }
}