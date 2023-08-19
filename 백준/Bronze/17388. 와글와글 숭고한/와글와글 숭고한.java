import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String min = "";
        if(a<b&&a<c) min = "Soongsil";
        if(b<a&&b<c) min = "Korea";
        if(c<b&&c<a) min = "Hanyang";
        String result = a+b+c<100 ? min : "OK";
        System.out.print(result);
    }
}