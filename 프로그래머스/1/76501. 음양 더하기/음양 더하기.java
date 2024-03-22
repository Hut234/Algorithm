class Solution {
  public int solution(int[] absolutes, boolean[] signs) {
    int result = 0;
    for (int i = 0; i < signs.length; i++) {
      boolean sign = signs[i];
      int absolute = absolutes[i];
      if (sign) {
        result += absolute;
      } else {
        result -= absolute;
      }
    }
    return result;
  }
}