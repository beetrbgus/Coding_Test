package Programmers.lv1;

/**
 * 정수 내림차순으로 배치하기
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * n은 1이상 80억 이하인 자연수입니다.
 */
public class P_12933_SortDesc {
    public long solution(long n) {
        int nLength = String.valueOf(n).length();
        int[] arr = new int[10];
        for (int i = 0; i < nLength; i++) {
            int mod = (int)(n%10);
            arr[mod]++;
            n = n / 10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 0 ) continue;
            else {
                for (int j = 0; j < arr[i]; j++) {
                    stringBuilder.append(i);
                }
            }
        }
        return Long.parseLong(stringBuilder.toString());
    }

    public static void main(String[] args) {
        P_12933_SortDesc a = new P_12933_SortDesc();
//        System.out.println(a.solution(798805332));

        for (int i = 100000; i < 100000000; i++) {
            System.out.println(a.solution(i));
        }
    }

}
