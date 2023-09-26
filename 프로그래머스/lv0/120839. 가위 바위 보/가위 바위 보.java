class Solution {
    public String solution(String rsp) {
        //가 2 바 0 보 5
        StringBuilder sb = new StringBuilder();
        String[] spl = rsp.split("");
        String s;
        for(int i=0; i<spl.length; i++) {
            s = spl[i].equals("2") ? "0" : spl[i].equals("0") ? "5" : "2";
            sb.append(s);
        }
        return sb.toString();
    }
}