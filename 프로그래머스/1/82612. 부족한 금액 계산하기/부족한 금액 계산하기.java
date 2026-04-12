class Solution {
    public long solution(int price, int money, int count) {
        long l_money = money;
        long now_price = price;
        
        for (int i = 0; i < count; i++) {
            l_money -= now_price;
            now_price = price * (i+2);
        }

        if (l_money >= 0) return 0;
        
        return Math.abs(l_money);
    }
}