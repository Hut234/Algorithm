import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String[] strs = {" @@@   @@@  ", "@   @ @   @ ", "@    @    @ ", 
                         "@         @ ", " @       @  ", "  @     @   ", 
                         "   @   @    ", "    @ @     ", "     @      "};
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(strs[i]);
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}