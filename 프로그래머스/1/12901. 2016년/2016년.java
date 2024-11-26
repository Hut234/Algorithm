import java.util.*;
class Solution {
    public String solution(int a, int b) {
        Map<Integer, String> days = new HashMap<>();
        days.put(0, "FRI");
        days.put(1, "SAT");
        days.put(2, "SUN");
        days.put(3, "MON");
        days.put(4, "TUE");
        days.put(5, "WED");
        days.put(6, "THU");
        
        
        Map<Integer, Integer> months = new HashMap<>();
        months.put(1, 31);
        months.put(2, 29);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        
        a -= 1;
        int answer = b-1;
        for(int i=1; i<=a; i++) {
            answer += months.get(i);
        }
        
        
        
        return days.get(answer%7);
    }
}