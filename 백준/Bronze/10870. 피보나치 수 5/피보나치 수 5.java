class Main{
    public static void main(String[] args){
        int[] arr = new int[21];
        arr[1] = 1;
        for(int i=2; i<21; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.print(arr[new java.util.Scanner(System.in).nextInt()]);
    }
}