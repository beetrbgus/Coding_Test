package Programmers.lv1;

/**
 * 2019 카카오 겨울 인턴문제
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/64061">크레인 인형뽑기 게임</a>
 */
public class P_64061_크레인_인형뽑기 {
    /**
     * 바구니에는 인형 삽입, 마지막 인형 보기, 인형 제거가 있지만
     * Stack을 사용하지 않고 1차원 배열로 만들어 봄.
     */
    public static int solution(int[][] board, int[] moves) {
        int answer = 0; // 정답 변수
        int[] basket = new int[moves.length]; // 인형을 담을 바구니
        int basketLastIndex = 0; // 바구니의 마지막 index

        // 입력된 moves만큼 순회하여 인형뽑기 시작
        for (int i = 0; i < moves.length; i++) {
            int moveIndex = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                //뽑은 곳이 인형이 없으면 한개 더 깊이 들어가야 함
                if(board[j][moveIndex] != 0) {
                    // 바구니의 마지막 원소가 0이라면 빈 칸임.
                    // 바구니가 비었지 않고, 뽑은 인형이 같으면 제거하고 answer를 2 증가시킴,
                    if(basketLastIndex != 0 &&
                            board[j][moveIndex] == basket[basketLastIndex -1]) {
                        basket[basketLastIndex] = 0;
                        basketLastIndex--;
                        answer += 2;
                    }
                    // 바구니가 비었거나, 인형이 같지 않으면 basket에 옮겨 담음.
                    else {
                        basket[basketLastIndex] = board[j][moveIndex];
                        basketLastIndex++;
                    }
                    // 어쨌던간에 인형은 뽑혔기 때문에 해당 칸은 0처리.
                    board[j][moveIndex] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
}
