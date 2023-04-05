package honeybee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C07Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열
        // 동일한 자료형의 자료를 여러개 저장하기 위한 자료구조
        // 데이터 입력 순서 기억, 중복 자료 저장 가능
        // 자료형 변수명[] = {}
        // 자료형[] 변수명 = {}

        // 점심메뉴 정의

        //String menu[] = {"자장면","라면","김밥","국밥","뚝배기불고기"}; 이리도 작성이 가능하다.
        String[] menu = {"자장면","라면","김밥","국밥","뚝배기불고기"};
        System.out.println(menu.length);
        System.out.println(menu[0]);
        for (int i=0;i<5;++i){
            System.out.println(menu[i]);
        }

        // 배열 정의시 한번 설정한 크기는 변경 불가 - 고정크기 => 배열안에 값도 지정불가
        //자료형 변수명[] = new 자료형[배열의갯수];
        //자료형 변수명[] = new 자료형[]{값1,값2,값3,값4...};
        //String[] dinner = new String[5];
        String[] dinner = new String[] {"자장면","라면","김밥","국밥","뚝배기불고기"};

        dinner[0] = "뚝배기불고기";
        dinner[1] = "국밥";
        dinner[2] = "김밥";
        dinner[3] = "라면";
        dinner[4] = "자장면";
        for (int i=0;i< dinner.length;++i){
            System.out.println(dinner[i]);
        }

        //동적 배열 - ArrayList => collection 프레임워크의 한 요소
        // import java.util.ArrayList; 구문이 추가되어야한다.
        // ArrayList<자료형> 변수명 = new ArrayList<>();
        // 동적배열에 값을 추가할때 변수명.add로 작성
        // 동적 배열로 출력할때 변수명.get()으로 출력
        // 정적 배열의 길이는 length, 동적 배열의 길이는 size()
        ArrayList<String> dinner1 = new ArrayList<String>();

        dinner1.add("라면");
        dinner1.add("자장면");
        dinner1.add("순대");
        dinner1.add("짬뽕");
        dinner1.add("떡볶이");
        dinner1.add("김밥");

        for (int i=0;i < dinner1.size() ; ++i){
            System.out.println(dinner1.get(i));
        }

        int[] nums = new int[5];
        int sum = 0;

        for (int i = 0; i < nums.length; ++i) {
            System.out.print(i + "번째 숫자는? ");
            nums[i] = sc.nextInt();
            sum += nums[i];             // 누적합
        }
        double avg = (double) sum / nums.length;

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("입력하신 숫자는 %d\n", nums[i]);
        }System.out.printf(
                "총합은 %d, 평균은 %.1f 입니다\n", sum, avg);

        // JDK 1.5부터 추가된 enhanced for loop
        // for (변수선언 : 대상객체){ 변수 출력 }

        for(int val:nums) {System.out.printf("입력하신 숫자는 %d\n", val);}

        String[] stu = new String[3];
        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] math = new int[3];

        int[] tot1 = new int[3];
        double[] avg1 = new double[3];
        String[] grd = new String[3];

        for(int i =0; i < stu.length; ++i) {
            System.out.print((i + 1) + "학생은? ");
            stu[i] = sc.next();
            kor[i] = sc.nextInt();
            eng[i] = sc.nextInt();
            math[i] = sc.nextInt();
            tot1[i] = kor[i] + eng[i] + math[i];
            avg1[i] = tot1[i] / 3.0;
            switch ((int) (avg1[i] / 10)) {
                case 10:
                case 9:
                    grd[i] = "수";
                    break;
                case 8:
                    grd[i] = "우";
                    break;
                case 7:
                    grd[i] = "미";
                    break;
                case 6:
                    grd[i] = "양";
                    break;
                default:
                    grd[i] = "가";
                    break;
            }
            System.out.printf("%s,%d,%d,%d,%d,%.1f,%s\n",stu[i],kor[i],eng[i],math[i],tot1[i],avg1[i],grd[i]);
        }





    }
}
