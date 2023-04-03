package honeybee;

public class CO1DateType {

    public static void main(String[] args) {
        /*변수와 자료형
        * 변수는 데이터를 담는 그릇
        * 변수 선언시 변수에 저장할 값의 유형을 지정해야함
        * 값의 유형에는 정수/실수/문자/불리언/문자열 등이 있음*/
        int a = 10;
        int b = 3;
        int c = a+b;
        System.out.println("a : "+a +"b : "+b);
        System.out.println("a + b : "+c);

        // 변수의 자료형이 동일한 경우 한 줄로 선언가능
        int time = 20 ,speed = 20;
        System.out.println("time : "+time +",speed : "+speed);

        // 상수 : 변하지 않는 값을 담는 그릇, final 로 선언
        // 상수 선언시 이름은 주로 대문자 사용
        final double PI = 3.14;
        // PI = 123.456;  상수에 값 대입시 오류 발생
        int pi2 = (int)PI;
        System.out.println("pi2"+pi2);
        System.out.println("PI"+PI);

        //자료형
        //자바의 자료형에는 기본자료형과 참조자료형으로 나뉨
        //기본자료형 : 단일값을 다룸 (정수,실수,문자,불리언)
        //참조자료형 : 값이 저장된 주소를 다룸 (문자열,배열,클래스)

        // 정수 integer : byte, short, int, long
        int d = 123;
        byte e = 1;
        short f = 25123;
        //int g = 123456123456;
        long g = 123456123456L;  // long을 나타내기위해 접미사 L을 추가

        // 실수 : float, double
        // 자바에서 실수는 기본적으로 double로 취급
        double h = 1234.5678;

        //아래 숫자가 float을 나타내기위해 접미사 F가 필요함
        float i = 9876.5432F;

        // 문자 : char
        // 자바에서 단일문자를 다룰때 사용 (작은 따옴표로 정의)
        char j = 'a';
        char k = '가';

        // 논리형 : boolean
        boolean n = true;
        boolean m = false;

        // 문자열 : String
        // 자바에서 여러문자를 다룰때 사용(큰 따옴표로 정의)

        String l = "\uD83D\uDE00";
        System.out.println(l);


      // ex) 성적 처리프로그램 v1
      // 이름, 국어, 영어, 수학을 초기화시켜서
        // 총점, 평균을 계산한 뒤 결과를 출력

        String name = "문동은";
        int kor = 90;
        int eng = 98;
        int math = 96;
        int tot = kor + eng + math;
        // double avg = (double)tot/3; 아래의 코드와 값이 같다
        double avg = tot/3.0;
        System.out.println("이름 :"+name+"국어 :"+kor+"영어 :"+eng+"수학 :"+math+"총점 :"+tot+"평균 :"+avg);

        System.out.printf("이름 : %s \n",name);
        System.out.printf("국어 : %d \n",kor);
        System.out.printf("영어 : %d \n",eng);
        System.out.printf("수학 : %d \n",math);
        System.out.printf("총점 : %d \n",tot);
        System.out.printf("평균 : %f \n",avg);

    }
}
