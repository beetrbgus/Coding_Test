package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/340213">동영상 재생기</a>
 */
public class P_340213_동영상_재생기 {

    /**
     *
     * @param video_len 동영상 길이
     * @param pos 기능이 수행되기 직전의 재생위치
     * @param op_start 오프닝 시작 시각
     * @param op_end 오프닝 종료 시각
     * @param commands 사용자의 입력
     * @return 명령어 수행 이후 최종 위치
     */

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int posTime = getTime(pos);
        int opStartTime = getTime(op_start);
        int opEndTime = getTime(op_end);
        int videoLenTime = getTime(video_len);

        for (String command : commands) {
            posTime = inOpening(posTime, opStartTime, opEndTime);

            if("next".equals(command)) {
                posTime = moveNext(posTime, videoLenTime);
            } else {
                posTime = movePrev(posTime, opStartTime, opEndTime);
            }
            posTime = inOpening(posTime, opStartTime, opEndTime);
        }

        return setTime(posTime);
    }

    public static int inOpening(int pos, int opStartTime, int opEndTime) {
        if(opStartTime <= pos && opEndTime >= pos) {
            return opEndTime;
        }
        return pos;
    }

    public static int moveNext(int pos, int videoLenTime) {
        final int NEXT = 10;
        int nextTime = pos + NEXT;

        return Math.min(nextTime, videoLenTime);
    }

    public static int movePrev(int pos, int opStartTime, int opEndTime) {
        final int PREV = -10;

        if(opStartTime <= pos && opEndTime >= pos) {
            pos = opEndTime;
        }
        int prevTime = pos + PREV;

        return Math.max(prevTime, 0);
    }

    public static String setTime(int pos) {
        int minute = pos / 60;
        int seconds = pos % 60;

        StringBuilder sb = new StringBuilder();
        sb.append(minute < 10 ? "0" + minute : minute);
        sb.append(":");
        sb.append(seconds < 10 ? "0" + seconds : seconds);
        return sb.toString();
    }

    public static int getTime(String time) {
        String[] arr = time.split(":");
        int minute =  Integer.parseInt(arr[0]) * 60; // 0 ~ 59
        int seconds =  Integer.parseInt(arr[1]); // 0 ~ 59

        return minute + seconds;
    }

    public static void main(String[] args) {
        String video_len = "10:55";
        String pos = "00:16";
        String op_start = "00:15";
        String op_end = "00:17";
        String[] commands = new String[]{"prev"};

        String result = solution(video_len, pos, op_start, op_end, commands);

        System.out.println(result);
    }
}
