package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120839">가위 바위 보</a>
 */
public class P_120839_가위_바위_보 {
    /**
     * 가위는 2 바위는 0 보는 5로 표현합니다.
     * 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
     * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸
     * 문자열을 return하도록 solution 함수를 완성해보세요.
     */
    public String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(
            s -> s.equals("2") ? "0"  : ( s.equals("0" )? "5": "2")
        ).collect(Collectors.joining());
    }

    public String solution2(String rsp) {
        return Arrays.stream(rsp.split("")).map(
            s -> {
                String result = "";
                switch (s) {
                    case "2" : result = "0"; break;
                    case "0" : result = "5"; break;
                    case "5" : result = "2"; break;
                }
                return result;
            }
        ).collect(Collectors.joining());

    }
}
