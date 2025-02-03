class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String compare = k+"";
        for(int p=i; p<=j; p++) {
            String[] arr = String.valueOf(p).split("");
            for(int z=0; z<arr.length; z++) {
                if(compare.equals(arr[z])) answer++;
            }
            
        }
        
        return answer;
    }
}