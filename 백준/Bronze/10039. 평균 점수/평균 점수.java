import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int aa = a >= 40 ? a : 40;
        int b = sc.nextInt();
        int bb = b >= 40 ? b : 40;
        int c = sc.nextInt();
        int cc = c >= 40 ? c : 40;
        int d = sc.nextInt();
        int dd = d >= 40 ? d : 40;
        int e = sc.nextInt();
        int ee = e >= 40 ? e : 40;
        System.out.print( (aa+bb+cc+dd+ee)/5);
    }
}