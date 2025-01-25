class Solution {
    // 최대 공약수 구하기
    public int gcd(int a, int b){
        while(a != 0){
            int r = b % a;
            b = a;
            a = r;
        }
        return b;
    }
    
    public int solution(int n) {
        int g = 0;
        
        if(6/n > 0){
            g = gcd(n, 6);
        }
        else{
            g = gcd(6, n);
        }
        
        return n/g;
    }
}