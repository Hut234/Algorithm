class Solution {
    public int[] solution(int brown, int yellow) {
        int width = yellow;
        int height = 1;
        while (width >= height) {
            if ((width + height) * 2 + 4 == brown) break;
            width = yellow / ++height;
            if (yellow % height != 0) width++;
        }
        
        return new int[] {width + 2, height + 2};
    }
}