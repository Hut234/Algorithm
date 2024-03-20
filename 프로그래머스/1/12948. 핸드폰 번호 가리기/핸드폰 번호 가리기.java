class Solution {
    public String solution(String phone_number) {
        String substring = phone_number.substring(0, phone_number.length() -4);
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=substring.length(); i++) {
          sb.append("*");
        }
        return phone_number.replace(substring, sb);
    }
}