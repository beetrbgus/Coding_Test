package Programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/92334">붕대 감기</a>
 */
public class P_92334_신고_결과_받기 {
    /**
     * 신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다.
     * 무지가 개발하려는 시스템은 다음과 같습니다.
     *
     * 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
     * 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
     * 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
     * k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
     * 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
     * @param args
     */
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] reposts = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] results = solution(id_list, reposts, k);

        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> reportsMap = new HashMap<>();

        // 신고 목록 중복 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        // 신고 목록에서 신고 횟수 넣기
        reportSet.stream()
            .forEach(s -> {
                String[] reportArr = s.split(" ");
                String reported = reportArr[1];
                List<String> reportedList = reportsMap.getOrDefault(reported, new ArrayList<>());
                reportedList.add(reportArr[0]);
                reportsMap.put(reported, reportedList);
            });
        // 신고한 이메일 받을 곳
        Map<String, Integer> responseEmail = new HashMap<>();
        reportsMap.forEach((s, strings) -> {
            if(strings.size() >= k) {
                strings.forEach(
                    s1 -> responseEmail.put(s1, responseEmail.getOrDefault(s1, 0) + 1)
                );
            }
        });
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
        String userName = id_list[i];
            answer[i] = responseEmail.getOrDefault(userName, 0).intValue();
        }
        return answer;
    }
}
