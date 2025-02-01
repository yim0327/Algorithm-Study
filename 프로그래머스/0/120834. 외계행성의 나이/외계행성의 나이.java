class Solution {
    public String solution(int age) {
        String answer = "";
        
        int a = age / 1000;
        int b = age / 100 - age / 1000 * 10;
        int c = age / 10 - age / 100 * 10;
        int d = age - age / 10 * 10;
        
        char p = (char)(a + 97);
        char q = (char)(b + 97);
        char r = (char)(c + 97);
        char s = (char)(d + 97);
        
        if(age / 1000 != 0){         
            answer = "" + p + q + r + s;
        }
        else if(age / 100 != 0){     
            answer = "" + q + r + s;
        }
        else if(age / 10 != 0){
            answer = "" + r + s;
        }
        else{
            answer = "" + s;
        }
        
        return answer;
    }
}

// a = 141