class Solution {
    public long solution(int price, int money, int count) {
        long total = count *(price + (long)price*count) /2;
        
        return total-money > 0 ? total-money : 0 ;
    }
}