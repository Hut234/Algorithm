class Solution {
    public int solution(int a, int b) {
        int aa = Integer.parseInt(a + "" + b);
        int bb = Integer.parseInt(b + "" + a);
        return aa > bb ? aa : bb;
    }
}