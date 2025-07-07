class Solution {
    // 유클리드 호제법
    public int gcd(int a, int b){
        if(b==0){return a;}
        return gcd(b, a%b);
    }
    
    public int solution(int a, int b) {
        // 분자,분모의 최대 공약수(gcd)
        int g = gcd(Math.max(a, b), Math.min(a, b));
        b /= g; // 기약분수의 분모로 만들기
        
        while(b % 2 == 0){b/=2;}
        while(b % 5 == 0){b/=5;}
        
        return b == 1 ? 1 : 2;
    }
}