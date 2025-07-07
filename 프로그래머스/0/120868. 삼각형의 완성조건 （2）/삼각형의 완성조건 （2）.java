class Solution {
    public int solution(int[] sides) {
        /* 
            짧은 변=a, 긴 변=b, 나머지 한 변=x
        
            b가 가장 길 때 :
                a + x > b,
                b - a < x,
                b-a+1 <= x

            x가 가장 길 때 :
                a + b > x,
                a+b-1 >= x

            그러므로 : b-a+1 <= x <= a+b-1 구간
            
            그때, x = (a+b-1) - (b-a+1) + 1
            
            식 정리 : x = 2a-1
        */
        return 2*Math.min(sides[0], sides[1])-1;
    }
}
