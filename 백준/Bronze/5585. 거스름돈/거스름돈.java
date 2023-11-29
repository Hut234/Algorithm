class Main{
    public static void main(String[] args){
        int N = 1000 - new java.util.Scanner(System.in).nextInt();
        int cnt = N /500;
        
        N %= 500;
        cnt += N /100;
        
        N %= 100;
        cnt += N /50;
        
        N %= 50;
        cnt += N /10;
        
        N %= 10;
        cnt += N /5;
        
        N %= 5;
        
        System.out.print(cnt += N /1);
            
            
        
    }
}