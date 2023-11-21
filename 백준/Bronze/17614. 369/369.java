class Main{
    public static void main(String[] args){
        int result = 0;
        int N = new java.util.Scanner(System.in).nextInt();
        for(int i=3; i<=N; i++){
            if(i%3==0) result++;
        }
        System.out.print(result);
    }
}