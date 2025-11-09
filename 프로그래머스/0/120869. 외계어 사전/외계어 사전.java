import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] target = String.join("", spell).toCharArray();
        Arrays.sort(target);

        for (String word : dic) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            if (Arrays.equals(target, arr)) {
                return 1;
            }
        }

        return 2;
    }
}