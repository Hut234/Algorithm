class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number+1];
        for(int i=2; i<=number; i++) {
            for(int j=i; j<=number; j+=i) arr[j]++;
        }
        
        int answer = -1;
        for(int val : arr) answer += val+1>limit ? power : val+1;
        
        return answer;
    }
}