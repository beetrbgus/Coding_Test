package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120861">캐릭터의 좌표</a>
 */
public class P_120861_캐릭터의_좌표 {
    public static int[] solution(String[] keyinput, int[] board) {
        // 가로 최댓값 : Math.abs(board[0]) / 2, 세로 최댓값 : Math.abs(board[1] / 2)
        int[] answer = new int[2];
        int widthMax = board[0] / 2;
        int heightMax = board[1] / 2;
        for (int i = 0; i < keyinput.length; i++) {
            String key = keyinput[i];
            switch (key) {
                case "up":
                    if (answer[1] >= heightMax) {
                        continue;
                    }
                    answer[1]++;
                    break;
                case "down":
                    if (answer[1] <= -heightMax) {
                        continue;
                    }
                    answer[1]--;
                    break;
                case "right":
                    if (answer[0] >= widthMax) {
                        continue;
                    }
                    answer[0]++;
                    break;
                default:
                    if (answer[0] <= -widthMax) {
                        continue;
                    }
                    answer[0]--;
            }
        }
        return answer;
    }
    public static void main (String[]args){
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        int[] result = solution(keyinput, board);
        for (int index : result) {
            System.out.println(index);
        }
    }

}
