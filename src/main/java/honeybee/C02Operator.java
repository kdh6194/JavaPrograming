package honeybee;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class C02Operator {
    public static void main(String[] args) {
         // 표현식 expression : 리터럴(값), 식별자(변수), 연산자, 함수 호출등의 조합을
         // 연산자 : 하나 이상의 표현식을 대상으로 산술,할당(대입),비교,논리,
         //          하나의 값을 만드는 기호를 의미

        int x = 10 , y = 20;
        System.out.printf("%d + %d = %d\n",x,y,x+y);
        System.out.printf("%d - %d = %d\n",x,y,x-y);
        System.out.printf("%d * %d = %d\n",x,y,x*y);
        System.out.printf("%d / %d = %d\n",x,y,x/y);
        System.out.printf("%d %% %d = %d\n",x,y,x%y);

        // 관계연산자
        System.out.printf("%d가 %d보다 크나요? : %b\n",x,y,x>y);
        System.out.printf("%d가 %d보다 작나요? : %b\n",x,y,x<y);
        System.out.printf("%d이 %d와 같나요? : %b\n",x,y,x==y);

        //논리연산자
        System.out.printf("x < 10 AND x < 20 : %b\n",x<10 && x<20);
        System.out.printf("x < 10 OR x < 20 : %b\n",x<10 || x<20);
        System.out.printf("NOT(x < 10 AND x < 20) : %b\n",!(x<10 && x<20));

        // ✋ : 자바에서는 적용이 안됨!
        //     System.out.printf("1+true : %b\n",1+true);
        //     System.out.printf("false+true : %b\n",false+true);

        // 할당연산자 : syntatic sugar
        System.out.printf("x값은 %d\n", x );

        x += 2; //x = x+2;
        System.out.printf("x + 2 = %d\n", x );

        x *= 2; //x = x*2;
        System.out.printf("x * 2 = %d\n", x );

        x -= 2; //x = x-2;
        System.out.printf("x - 2 = %d\n", x );

        // 증가, 감소 연산자
        x = 10;
        System.out.printf("++x + 1 = %d\n", ++x + 1 );

        x = 10;
        System.out.printf("x++ + 1 = %d\n", x++ + 1 );

        x = 10;
        System.out.printf("--x + 1 = %d\n", --x + 1 );

        x = 10;
        System.out.printf("x-- + 1 = %d\n", x-- + 1 );

        // 문자열 연산 : +  => 이거보단 printf 메서드 사용 추천
        String name = "홍길동";
        String name1 = "문동은";

        System.out.println("나의 이름은 : " + name);
        System.out.printf("나의 이름은 : %s\n",name1);

        // 삼항 연산자 : if문의 syntatic sugar
        // 조건식 ? 참일때 값 : 거짓일때 값

        // ex) 평균점수가 60이상이면 '합격'
        // 아니면 '불합격'이라 출력

        System.out.println("평균 점수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String x1 = scanner.nextLine();
        double jumsu = Integer.parseInt(x1);

//      double jumsu = 68.5;
        String result = jumsu >=60 ? "합격" : "불합격";

        // 평균점수가 ~라면 결과는 ~입니다
        String fmt = "평균점수가 %.0f라면 결과는 %s 입니다\n";
        System.out.printf(fmt,jumsu,result);
    }
}
