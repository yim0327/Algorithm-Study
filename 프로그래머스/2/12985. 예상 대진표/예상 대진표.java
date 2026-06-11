class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        
        while (!(y%2==0 && x+1==y)) {
            if (x%2 != 0) x++;
            if (y%2 != 0) y++;
            
            x = x >> 1;
            y = y >> 1;
            
            answer++;
        }

        return answer;
    }
}