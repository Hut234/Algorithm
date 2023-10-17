class Main{
    public static void main(String[] args) {
        int diff = new java.util.Scanner(System.in).nextInt();
        int result = 0;
        for(int i=1; i<=500; i++) {
            for(int j=i; j<=500; j++) {
                int val = i * i + diff;
                if (val < j * j) {
                    break;
                } else {
                    if (val == j * j) {
                        result++;
                        break;
                    }
                }
            }
        }
        System.out.print(result);
    }
}