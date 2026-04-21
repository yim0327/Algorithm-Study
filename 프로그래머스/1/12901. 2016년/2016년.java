class Solution {
    public String solution(int a, int b) {
        int d = 0;
        
        for (int i = 1; i < a; i++) {
            if (i == 2) d += 29;
            else if ((i < 7 && i % 2 == 0) 
                     || (i > 7 && i % 2 != 0)) {
                d += 30;
            }
            else {
                d += 31;
            }
        }
        
        d += b;
        
        switch (d % 7) {
            case 0 : return "THU";
            case 1 : return "FRI";
            case 2 : return "SAT";
            case 3 : return "SUN";
            case 4 : return "MON";
            case 5 : return "TUE";
            case 6 : return "WED";
            case 7 : return "THU";
        }
        
        return "fail";
    }
}