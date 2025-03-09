package BackJoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 전공평점 = 과목별 (학점 * 과목평점) / 총 학점
 */
public class B_25206_너의_평점은 {
    static Map<String, Double> gradeMap = new HashMap<String, Double>();

    public static double solution(List<String> gradeList) {
        double totalGrade = 0.0; // 총 학점
        double gradePoint = 0.0; // 전공총점
        for(String grade : gradeList) {
            String[] gradeArr = grade.split(" ");
            double score = Double.parseDouble(gradeArr[1]);
            String gradeStr = gradeArr[2];

            if("P".equals(gradeStr)) {
                continue;
            }
            double gradeScore = gradeMap.get(gradeStr);

            totalGrade += score;
            gradePoint += score * gradeScore;
        }
        return gradePoint / totalGrade;
    }
    public static void main(String[] args) throws IOException {
        List<String> gradeList = new ArrayList<String>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i++) {
            String grade = br.readLine();
            gradeList.add(grade);
        }

        double result = solution(gradeList);
        System.out.println(result);
    }
}