class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        int len = str_list.length;
        for (int i = 0; i < len; i++) {
            if (str_list[i].contains(ex)) continue;
            sb.append(str_list[i]);
        }
        return sb.toString();
    }
}