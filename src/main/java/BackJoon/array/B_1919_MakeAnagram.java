package BackJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/1919">애너그램 만들기</a>
 * 두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때, 그러한 두 단어를 서로 애너그램 관계에 있다고 한다. <br>
 * 예를 들면 occurs 라는 영어 단어와 succor 는 서로 애너그램 관계에 있는데, <br>
 * occurs의 각 문자들의 순서를 잘 바꾸면 succor이 되기 때문이다. <br>
 *
 * 한 편, dared와 bread는 서로 애너그램 관계에 있지 않다.<br>
 * 하지만 dared에서 맨 앞의 d를 제거하고, bread에서 제일 앞의 b를 제거하면, <br>
 * ared와 read라는 서로 애너그램 관계에 있는 단어가 남게 된다.
 *
 * 두 개의 영어 단어가 주어졌을 때, 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 <br>
 * 최소 개수의 문자 수를 구하는 프로그램을 작성하시오. <br>
 * 문자를 제거할 때에는 아무 위치에 있는 문자든지 제거할 수 있다. <br>
 *
 * 첫째 줄과 둘째 줄에 영어 단어가 소문자로 주어진다. <br>
 * 각각의 길이는 1,000자를 넘지 않으며, 적어도 한 글자로 이루어진 단어가 주어진다.
 */
public class B_1919_MakeAnagram {
    /**
     * 두 문자의 길이가 같지 않다면 애너그램 관계에 있지 않기 때문에,
     * 길이 고려하지 않는다고 생각하고 아래 deprecated()처럼 풀었다가
     * 제출에서 StringIndexOutBounds 에러가 뜸.
     * 문제는 aaa bbbb 처럼 문자열이 다른 경우도 있다고 생각하는 것 같다.
     */
    public static int deprecated(String first, String second) {
        int[] alphabetArr = new int['z'-'a'+1];
        int answer = 0;
        for (int i = 0; i < first.length(); i++) {
            alphabetArr[first.charAt(i) - 'a']++;
            alphabetArr[second.charAt(i) - 'a']--;
        }
        for (int i = 0; i < alphabetArr.length; i++) {
            answer += Math.abs(alphabetArr[i]);
        }
        return answer;
    }

    /**
     * a - z 까지의 배열을 만듦
     * first의 i번째 alphabet에 ++
     * second의 i번째 alphabet에 --
     * 를 해서 절대값으로 모두 더함.
     * first에 aabb 이고
     * second에 bccd 면
     * first에서는 [2,2,0,0 ....]
     * second에서 [0,-1,-2,-1 ....] 로
     * [2,1,-2,-1]이 된다
     * 절대값으로 모두 더하면
     * a 2개, b 1개, c 2개, d 1개
     * 총 6개를 바꿔야 한다.
     */
    public static int solution(String first, String second) {
        int[] alphabetArr = new int['z'-'a'+1];
        int answer = 0;
        for (int i = 0; i < first.length(); i++) {
            alphabetArr[first.charAt(i) - 'a']++;
        }
        for (int i = 0; i < first.length(); i++) {
            alphabetArr[second.charAt(i) - 'a']--;
        }
        for (int i = 0; i < alphabetArr.length; i++) {
            answer += Math.abs(alphabetArr[i]);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        int result = solution(first, second);
        System.out.println(result);
    }
}
