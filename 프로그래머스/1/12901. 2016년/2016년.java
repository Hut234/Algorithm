class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        
        int answer = b-1;
        for(int i=1; i<=a-1; i++) answer += months[i];

        return days[answer%7];
    }
}