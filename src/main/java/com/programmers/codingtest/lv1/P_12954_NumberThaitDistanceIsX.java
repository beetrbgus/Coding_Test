package com.programmers.codingtest.lv1;

/**
 * 함수 solution은 정수 x와 자연수 n을 입력 받아,
 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 */
public class P_12954_NumberThaitDistanceIsX {
    /**
     * x가 1000만이라고 가정하고, n이 1000으로 가정했을 떄
     * x * (i+1)을 실행할 때 answer에 담기전에 int형을 넘어버려서 long으로 형변환을 진행 시킴.
     */
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * (i+1);
        }
        return answer;
    }

    /**
     * 좋아요가 두번째로 많은 다른 사람의 풀이
     * 신기하게 0번째에 미리 담아두고 시작한다.
     * 문법상의 차이는 없는 것 같은데 왜 0은 미리 박아놓은 건지 궁금하다..
     */
    public static long[] solution2(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }
    public static void main(String[] args) {
        P_12954_NumberThaitDistanceIsX a = new P_12954_NumberThaitDistanceIsX();
        int x = 10000000;
        int n = 1000;
        long[] solution = a.solution(x, n);
        for (long element : solution) {
            System.out.println(element);
        }

    }
}
