package honeybee;

import java.util.Scanner;

public class C05Condition {
    public static void main(String[] args) {
        // 제어문
        // 프로그램의 실행 순서를 제어할 수 있는 문장
        // 조건문, 반복문, 분기문

        // 조건문
        // 조건에 대한 만족여부에 따라 실행할 코드를 결정하는 명령문
        // ex) 짝수, 홀수 여부 출력
        // 홀수 조건여부 (해당 숫자%2 != 0)
        // 짝수 조건여부 (해당 숫자%2 == 0)

        for (int i=1; i < 11; ++i){
            if (i%2 == 0) {
                System.out.println(i+"짝수입니다");
            }else {
                System.out.println(i+"홀수입니다");
            }
        }

        // ex) 오전, 오후 구분
        String time = "09:47:15";

        // 문자추출 : charAt(위치)
        String check = time.charAt(0) +""+ time.charAt(1);
        System.out.println(check);
        int hour = Integer.parseInt(check);
        if (hour >= 12) {
            System.out.println("오후입니다");
        }
        if (hour < 12) {
            System.out.println("오전입니다");
        }

        // ex) 투표 가능한 나이 구분

        System.out.println("나이를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("당신은 투표할 자격이 있습니다");
        }
        else {System.out.println("당신은 아직 투표할 자격이 없습니다");}

        //if ~ else 문
        //평균 점수가 60점이상 시험합격
        //평균 점수가 60점이하 시험불합격

        System.out.println("평균 점수는?");
        int jumsu = sc.nextInt();

        if (jumsu >= 60) {
            System.out.println("시험합격");
        }
        if (jumsu < 60) {
            System.out.println("시험 불합격");
        }

        //짝수, 홀수 여부 판단
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();

        if(num%2 == 0) {
            System.out.println("짝수입니다");
        }else {
            System.out.println("홀수입니다");
        }

        // ex) 아이디와 비밀번호를 이용해서
        // 로그인 기능 구현하기
        String userid = "abc123";
        String passwd = "987xyz";

        System.out.println("아이디를 입력하세요");
        String input1 = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String input2 = sc.next();

        //String형 변수 비교시 == 연산자는 대상의 주소값을 확인
        //정수,실수와는 달리 String은 참조자료형이기때문임
        //따라서 ,문자열 자체를 비교하려면 equals()를 사용

        if(input1.equals(userid)&&input2.equals(passwd)){
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
            System.out.println("아이디와 패스워드를 확인하세요");
        }

        // 중첩 조건문 - 가독성 저하로 비추

        // 다중 조건문
        // 둘 이상의 조건을 처리하는 조건문
        // if ~ else 뒤에 if ~ else를 계속 추가 가능함


        // 버스 기본요금 부과하기 - 나이를 입력받음
        // 미취학 아동 (~7세) : 0원
        // 어린이 (8~13) : 450원
        // 청소년 (14~19) : 720원
        // 일반 (20~) : 1200원
        // 노인 (70~) : 0원

        System.out.println("나이는?");
        age = sc.nextInt();
        int fee;

        if(age >= 70) {fee = 0;
            System.out.println(fee);}
        else if(age >= 20) {fee = 1200;
            System.out.println(fee);}
        else if(age >= 14) {fee = 720;
            System.out.println(fee);}
        else if(age >= 8) {fee = 450;
            System.out.println(fee);}
        else {fee = 0;
            System.out.println(fee);}

        // switch
        // 다중 조건문을 가독성 있게 작성한 조건문
        // switch의 표현식을 평가하여 그 값의 일치여부에 따라
        // case문 아래의 코드 블록을 실행하는 구조



    }
}
