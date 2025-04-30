class Solution {
    public String solution(String n_str) {
        if (n_str.startsWith("0")) {
            String[] arr = n_str.split("");
            int j = 1;
            for (int i=1; i<arr.length; i++) {
                if (arr[i].equals("0")) continue;
                else {
                    j = i;
                    break;
                }
            }
            
            return n_str.substring(j);
        } else {
            return n_str;
        }
    }
}