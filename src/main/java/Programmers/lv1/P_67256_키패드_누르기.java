package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/67256">[카카오 인턴] 키패드 누르기</a>
 */
public class P_67256_키패드_누르기 {
    static StringBuilder sb = new StringBuilder();
    static int leftHandPoint = 10;
    static int rightHandPoint = 12;
    public static String solution(int[] numbers, String hand) {

        boolean isLeft = hand.equals("left");
        for (int i = 0; i < numbers.length; i++) {
            int pressedkey = numbers[i] == 0 ? 11 : numbers[i];
            boolean isPressLeft = isLeft;
            if(pressedkey % 3 == 1) {
                isPressLeft = true;
            }
            else if (pressedkey % 3 == 0) {
                isPressLeft = false;
            }else {
                int distanceFromLeftHand = getDistance(pressedkey, leftHandPoint);
                int distanceFromRightHand = getDistance(pressedkey, rightHandPoint);
                if(distanceFromLeftHand < distanceFromRightHand) {
                    isPressLeft = true;
                }else if(distanceFromLeftHand > distanceFromRightHand){
                    isPressLeft = false;
                }
            }
            pressKey(pressedkey, isPressLeft);
        }
        return sb.toString();
    }
    // 거리 = 줄차이 + 같은 줄에 있지 않으면 1추가
    private static int getDistance(int pressedKey, int handPoint) {
        int pressLine = (pressedKey - 1) / 3 + 1; // 줄 구하기
        int handPointLine = (handPoint - 1) / 3 + 1; // 손 위치의 줄 구하기
        int distance = Math.abs(handPointLine - pressLine);
        int anotherLineDistance = Math.abs(handPoint - pressedKey) % 3 == 0 ? 0 : 1;
        return distance + anotherLineDistance;
    }
    public static void pressKey(int pressedkey, boolean isLeft) {
        if(isLeft) {
            leftHandPoint = pressedkey;
            sb.append("L");
        }else {
            rightHandPoint = pressedkey;
            sb.append("R");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = solution(numbers, hand);
        System.out.println(result);
    }
}
