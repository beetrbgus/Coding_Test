package Programmers.lv0;

/**
 * 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
 * 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
 */
public class P_120820_FindBirthYear {
    public int solution(int age) {
//        int nowYear = LocalDateTime.now().getYear();
        int nowYear = 2022; // 2022년 기준이라고 함.
        return nowYear - age + 1;
    }

    public static void main(String[] args) {
        P_120820_FindBirthYear findBirthYear = new P_120820_FindBirthYear();
        int age = 40;
        int solution = findBirthYear.solution(age);
        System.out.println("solution    : " + solution);
    }
}
