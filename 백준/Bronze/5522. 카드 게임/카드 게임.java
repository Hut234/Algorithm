class Main{
    public static void main(String[] args) throws Exception {
        System.out.print(read() + read() + read() + read() + read());
    }
    static int read() throws Exception {
        int c, n = 0;
        while(true) {
            c = System.in.read();
            if(c<'0'||c>'9') return n;
            n = n*10 + (c-'0');
        }
    }
}