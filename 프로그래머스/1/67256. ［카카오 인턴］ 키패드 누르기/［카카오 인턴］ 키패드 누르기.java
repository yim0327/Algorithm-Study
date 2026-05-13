class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] pos = {3, 0, 3, 2};
        
        for (int i : numbers) {
            // L
            if (i == 1) {
                pos[0] = 0;
                pos[1] = 0;
                sb.append("L");
            }
            else if (i == 4) {
                pos[0] = 1;
                pos[1] = 0;
                sb.append("L");
            }
            else if (i == 7) {
                pos[0] = 2;
                pos[1] = 0;
                sb.append("L");
            }
            // R
            else if (i == 3) {
                pos[2] = 0;
                pos[3] = 2;
                sb.append("R");
            }
            else if (i == 6) {
                pos[2] = 1;
                pos[3] = 2;
                sb.append("R");
            }
            else if (i == 9) {
                pos[2] = 2;
                pos[3] = 2;
                sb.append("R");
            }
            // mid
            else {
                int ltmp = 0;
                int rtmp = 0;
                
                if (i == 2) {
                    ltmp = Math.abs(0 - pos[0]) + Math.abs(1 - pos[1]);
                    rtmp = Math.abs(0 - pos[2]) + Math.abs(1 - pos[3]);
                }
                else if (i == 5) {
                    ltmp = Math.abs(1 - pos[0]) + Math.abs(1 - pos[1]);
                    rtmp = Math.abs(1 - pos[2]) + Math.abs(1 - pos[3]);
                }
                else if (i == 8) {
                    ltmp = Math.abs(2 - pos[0]) + Math.abs(1 - pos[1]);
                    rtmp = Math.abs(2 - pos[2]) + Math.abs(1 - pos[3]);
                }
                else {
                    ltmp = Math.abs(3 - pos[0]) + Math.abs(1 - pos[1]);
                    rtmp = Math.abs(3 - pos[2]) + Math.abs(1 - pos[3]);
                }
                
                // mid & R
                if (ltmp > rtmp || (ltmp == rtmp && hand.equals("right"))) {
                    sb.append("R");
                    
                    if (i == 2) {
                        pos[2] = 0;
                        pos[3] = 1;
                    }
                    else if (i == 5) {
                        pos[2] = 1;
                        pos[3] = 1;
                    }
                    else if (i == 8) {
                        pos[2] = 2;
                        pos[3] = 1;
                    }
                    else {
                        pos[2] = 3;
                        pos[3] = 1;
                    }
                }
                // mid & L
                else if (ltmp < rtmp || (ltmp == rtmp && hand.equals("left"))) {
                    sb.append("L");
                    
                    if (i == 2) {
                        pos[0] = 0;
                        pos[1] = 1;
                    }
                    else if (i == 5) {
                        pos[0] = 1;
                        pos[1] = 1;
                    }
                    else if (i == 8) {
                        pos[0] = 2;
                        pos[1] = 1;
                    }
                    else {
                        pos[0] = 3;
                        pos[1] = 1;
                    }
                }
            }
            
        }
        
        return sb.toString();
    }
}