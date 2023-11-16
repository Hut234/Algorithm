class Main{
    public static void main(String[] args){
        int N = new java.util.Scanner(System.in).nextInt();
        //1~N
        int sum = 0;
        //(1~N)^2
        int sum2 = 0;
        //1^3+2^3+N^3
        int sum3 = 0;
        for(int i=1; i<=N; i++) {
            sum += i;
            sum3 += i*i*i;
        }
        sum2 = sum*sum;
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}