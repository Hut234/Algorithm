class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number+1];
        for(int i=1; i<=number; i++) {
            for(int j=i; j<=number; j+=i) arr[j]++;
        }
        
        int answer = 0;
        for(int val : arr) answer += val>limit ? power : val;
        
        return answer;
    }
}