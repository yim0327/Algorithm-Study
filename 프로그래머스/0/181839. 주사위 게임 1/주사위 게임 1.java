import java.lang.Math;

class Solution {
    public int solution(int a, int b) {        
        return (a % 2 == 1 && b % 2 == 1) ? (int)(Math.pow(a,2) + Math.pow(b,2)) : (a % 2 == 0 && b % 2 == 0) ? (int)Math.abs(a-b) : 2*(a+b);
    }
}