import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int x_tmp = 0;
        int y_tmp = 0;
        
        for(int x = 0; x < dots.length; x++){
            if(x_tmp == 0){
                x_tmp = dots[x][0];
            }
            else if(x_tmp != dots[x][0]){
                x_tmp = x_tmp-dots[x][0];
                break;
            }
        }
        
        for(int y = 0; y < dots.length; y++){
            if(y_tmp == 0){
                y_tmp = dots[y][1];
            }
            else if(y_tmp != dots[y][1]){
                y_tmp = y_tmp-dots[y][1];
                break;
            }
        }
                
        return Math.abs(x_tmp) * Math.abs(y_tmp);
    }
}