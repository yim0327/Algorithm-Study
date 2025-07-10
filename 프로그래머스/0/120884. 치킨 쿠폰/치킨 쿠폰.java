class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int service = 0;
        int total = 0;
        
        while(coupon >= 10){
            service = coupon / 10;
            total += service;
            coupon = (coupon % 10) + service; // 잔여+페이백
        }
        
        return total;
    }
}