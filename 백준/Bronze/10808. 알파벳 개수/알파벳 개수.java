class Main{
    public static void main(String[] args){
        String s = new java.util.Scanner(System.in).next();
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) -'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }
}