package honeybee;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        // 데이터 입력 : Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("이름이 무엇입니까?");
        // 이름을 입력받은
        String name = sc.nextLine();
        System.out.printf("이름이 %s 맞습니까?\n",name);
        // 종료시 sc 객체 제거
        // sc.close()
        String check = sc.nextLine();
        if (check.equals("네") || check.equals("yes")||check.equals("Yes")) {

            System.out.println("점수를 입력해주세요");
//            String kor1 = sc.nextLine();
//            int kor = Integer.parseInt(kor1);
//            String eng1 = sc.nextLine();
//            int eng = Integer.parseInt(eng1);
//            String math1 = sc.nextLine();
//            int math = Integer.parseInt(math1);

            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            int tot = kor + eng + math;
            double avg = tot / 3.0;

            String grade = avg >= 90 ? "수" : avg >= 80 ? "우" : avg >= 70 ? "미" : avg >= 60 ? "양" : "가";

            System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.1f으로 학점은 %s 입니다",
                    name, kor, eng, math, tot, avg, grade);
            sc.close();
        } else {
            System.out.println("이름을 다시 확인해주세요");
            sc.close();
        }

    }
}
