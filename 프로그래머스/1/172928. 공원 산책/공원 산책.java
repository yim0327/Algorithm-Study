class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }

        for (String r : routes) {
            String[] dir = r.split(" ");
            int mv = Integer.parseInt(dir[1]);

            if (dir[0].equals("E")) {
                if (answer[1] + mv < park[0].length()) {
                    boolean flag = true;

                    for (int i = answer[1]; i <= answer[1] + mv; i++) {
                        if (park[answer[0]].charAt(i) == 'X') {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        answer[1] += mv;
                    }
                }
            }

            else if (dir[0].equals("W")) {
                if (answer[1] - mv >= 0) {
                    boolean flag = true;

                    for (int i = answer[1]; i >= answer[1] - mv; i--) {
                        if (park[answer[0]].charAt(i) == 'X') {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        answer[1] -= mv;
                    }
                }
            }

            else if (dir[0].equals("S")) {
                if (answer[0] + mv < park.length) {
                    boolean flag = true;

                    for (int i = answer[0]; i <= answer[0] + mv; i++) {
                        if (park[i].charAt(answer[1]) == 'X') {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        answer[0] += mv;
                    }
                }
            }

            else if (dir[0].equals("N")) {
                if (answer[0] - mv >= 0) {
                    boolean flag = true;

                    for (int i = answer[0]; i >= answer[0] - mv; i--) {
                        if (park[i].charAt(answer[1]) == 'X') {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        answer[0] -= mv;
                    }
                }
            }
        }

        return answer;
    }
}