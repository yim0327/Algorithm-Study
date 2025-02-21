class Solution {
    public int solution(int a, int b) {        
        return (a%2 == 1 && b%2 == 1) ? a*a+b*b : (a%2 == 0 && b%2 == 0) ? (a>b ? a-b : b-a) : 2*(a+b);
    }
}