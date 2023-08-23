import java.util.Scanner;
public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = sc.nextInt();
        int k = cnt;
        int n_sum = 1;
        int k_sum = 1;
        for(int i=0; i<cnt; i++, n--, k--) {
            n_sum *= n;
            k_sum *= k;
        }
        
		System.out.println(n_sum/k_sum);
    }
}