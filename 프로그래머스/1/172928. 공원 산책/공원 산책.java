class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2]; // 시작 r, c

        // 시작 위치 초기화
        for (int i = 0; i < park.length; i++) {
            int idx = park[i].indexOf('S');

            if (idx != -1) {
                answer[0] = i;
                answer[1] = idx;
                break;
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (String route : routes) {
            String[] r = route.split(" ");

            String dir = r[0];
            int dist = Integer.parseInt(r[1]);

            int k = 0;

            if (dir.equals("N")) k = 0;
            else if (dir.equals("S")) k = 1;
            else if (dir.equals("W")) k = 2;
            else if (dir.equals("E")) k = 3;

            int nr = answer[0];
            int nc = answer[1];
            boolean flag = true;

            for (int i = 0; i < dist; i++) {
                nr += dr[k];
                nc += dc[k];
                
                // 공원을 벗어나는지
                if (nr < 0 || nr >= park.length ||
                    nc < 0 || nc >= park[0].length()) {
                    flag = false;
                    break;
                }
                // 장애물을 만나는지
                if (park[nr].charAt(nc) == 'X') {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer[0] = nr;
                answer[1] = nc;
            }
        }

        return answer;
    }
}