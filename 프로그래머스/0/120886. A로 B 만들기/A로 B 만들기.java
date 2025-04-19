class Solution {
    public int solution(String before, String after) {
        int[] alphabets = new int[26];
        
        char[] beforeChr = before.toCharArray();
        char[] afterChr = after.toCharArray();
        for(int i = 0; i < beforeChr.length; i++) {
            int b = beforeChr[i] - 'a';
            int a = afterChr[i] - 'a';
            alphabets[b]++;
            alphabets[a]--;
        }
        
        boolean flag = true;
        for (int alphabet : alphabets) if (alphabet != 0) { 
            flag = false;
            break;
        }
        
        return flag ? 1 : 0;
    }
}