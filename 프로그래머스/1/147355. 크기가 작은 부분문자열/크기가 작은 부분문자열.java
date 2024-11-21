class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long standard = Long.parseLong(p);
        int standardLen = p.length();
        int strLen = t.length();
        
        for(int i=0; i+standardLen<=strLen; i++) {
            long val = Long.parseLong(t.substring(i, i+standardLen));
            if (val <= standard) answer++;
        }
        
        return answer;
    }
}