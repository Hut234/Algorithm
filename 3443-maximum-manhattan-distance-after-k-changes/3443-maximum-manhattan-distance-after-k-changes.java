class Solution {
    public static int maxDistance(String s, int k) {
        int eCount = 0;
        int wCount = 0;
        int sCount = 0;
        int nCount = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'E') {
                eCount++;
            } else if (c == 'W') {
                wCount++;
            } else if (c == 'S') {
                sCount++;
            } else {
                nCount++;
            }


            int conflicts = Integer.min(eCount, wCount) + Integer.min(sCount, nCount);
            int dist;
            if (conflicts <= k) dist = i + 1;
            else dist = (i + 1) - (2 * (conflicts - k));
            result = Integer.max(result, dist);
        }

        return result;
    }
}