class Solution {
    public int solution(int price) {
        int discount = 1;
        if(price >= 500000) {
          discount = 80;
        } else if(price >= 300000) {
          discount = 90;
        } else if(price >= 100000) {
          discount = 95;
        }
        return discount!=1 ? price*discount/100 : price;
    }
}