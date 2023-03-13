package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/133499">옹알이2</a>
 */
public class P_120956_옹알이1 {
    public static int solution(String[] babbling) {
        int answer = 0;

        for(int i=0; i<babbling.length; i++){
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") ||
                    babbling[i].contains("mama") || babbling[i].contains("woowoo"))
                continue;

            babbling[i] = babbling[i].replace("aya", "0");
            babbling[i] = babbling[i].replace("ye", "0");
            babbling[i] = babbling[i].replace("ma", "0");
            babbling[i] = babbling[i].replace("woo", "0");
            babbling[i] = babbling[i].replace("0", "");

            if(babbling[i].length()==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(babbling));
        System.out.println(solution(babbling2));
    }
}
