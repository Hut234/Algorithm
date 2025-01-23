class Solution {
    public int solution(int[] box, int n) {
        int width = box[0];
        int length = box[1];
        int height = box[2];
        return ((width/n) * (length/n)) * (height/n);
    }
}