class Main{
    public static void main(String[] args){
        String s = new java.util.Scanner(System.in).next();
        if(s.length()<5) {
            System.out.print("NO");
            return;
        }
        boolean[] flag = new boolean[5];
        char c;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(c=='M') {
                flag[0] = true;
            }else if(c=='O'){
                flag[1] = true;
            }else if(c=='B'){
                flag[2] = true;
            }else if(c=='I'){
                flag[3] = true;
            }else if(c=='S'){
                flag[4] = true;
            }
        }
        int cnt=5;
        for(boolean f : flag) if(f) cnt--;
        System.out.print(cnt==0?"YES":"NO");
    }
}