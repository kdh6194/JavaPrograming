package examples;

import java.util.Scanner;
import java.io.InputStream;
import java.io.IOException;

public class EX03 {
    public static void main(String[] args) {
        //가
        double number = 3 + (4.5 * 2) + (27 / 8.0);
        System.out.println(number);
        //나
        boolean x = true || false&& 3<4 || !(5==7);
        System.out.println(x);
        //다
        boolean y = true || (3<5&&6>=2);
        System.out.println(y);
        //라
        //boolean z = !ture > 'A';
        //System.out.println(z); 타입간에 충돌
        //마
        int s = (7%4)+3-(2/(6*'Z'));
        System.out.println(s);
        //바
        int m = 'D' + 1 + 'M' % 2 / 3;
        System.out.println(m);
        //사
        double g = 5.0/3 + 3/3;
        System.out.println(g);
        //아
        boolean h = 53%21 < 45/18;
        System.out.println(h);
        //자
        boolean j = (4<6)||true&&false||false&&(2>3);
        System.out.println(j);
        //차
        int k = 7 - (3 + 8 *6 +3) - (2+5*2);
        System.out.println(k);

        // --------------------------------------------------------------

        //가
        System.out.print( " May 13, 1988 fell on day number ");
        //나
        System.out.println( ( (13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400
                - 2 * (1988 / 100) ) % 7 + 7) % 7 );
        //다
        System.out.print( " Check out this line  ");
        //라
        System.out.println( " //hello there " + '9' + 7 );
        //마
        System.out.print( 'H' + 'I' + " is " + 1 + "more example" );
        //바
        System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
        //사
        //System.out.print( "Print both of us", "Me too" );  문자열 연결이 되지않아서
        //아
        System.out.print( "Reverse " + 'I' + 'T' );
        //자
        System.out.print( "No! Here is" + 1 + "more example" );
        //차
        System.out.println( "Here is " + (10 * 10) ) ; // that’s 100 ;
        //카
        System.out.println( "Not x is " + true );
        //타
        //System.out.print(  );  기본적으로 와야하는 따옴표가 없음
        //파
        //System.out.println;  프린트뒤에 괄호 없음
        //하
        //System.out.print( "How about this one" ++ '?' + 'Huh?' ); 문자열인 곳에 ''가 들어가서


        //-------------------------------------------------------------------

        //가
        boolean a = true&&false&&true||true;
        System.out.println(a);
        boolean b = true || true && true && false;
        System.out.println(b);
        boolean c =  (true && false) || (true && ! false) || (false && !false);
        System.out.println(c);
        boolean d = (2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4;
        System.out.println(d);
        boolean f =  6 == 9 || 5 < 6 && 8 < 4 || 4 > 3;
        System.out.println(f);


        //----------------------------------------------------------------------

        //이름, 몸무게, 나이
        Scanner sc = new Scanner(System.in);
        System.out.println("이름");
        String name = sc.nextLine();
        System.out.println("몸무게");
        double kg = sc.nextInt();
        System.out.println("나이");
        int age = sc.nextInt();

        String MyInfo = "이름 : %s, 몸무게 : %.0f, 나이 : %d\n";
        System.out.printf(MyInfo,name,kg,age);

        // ------------------------------------------------------------

        System.out.println("태어난 년도");
        int bth = sc.nextInt();
        int age1 = 2023 - bth;
        String MyAge = "%d 년에 태어난 사람의 나이는 %d살 입니다\n";

        System.out.printf(MyAge,bth,age1);

        //--------------------------------------------------------------

        for (int i = 1; i < 10 ; ++i) {
            int dan = 7 * i;
            System.out.printf(" 7 * %d = %d\n",i,dan);
        }

        // --------------------------------------------------------------

        long scd = 1234567890 / 86400;
        System.out.println(scd);
        long scd1 = 98765 / 3600;
        System.out.println(scd1);
        long scd2 = 12345 / 60;
        System.out.println(scd2);

        // ------------------------------------------

        int price = 25000;
        int dis = 10;
        double discnt = price * (dis/100.0);
        double sale = price - discnt;
        System.out.println("도서명 : 누구나 알기쉬운 자바: 입문편");
        System.out.println("저자 : 카와바 타케시");
        System.out.println("역자 : 하진일");
        System.out.println("출판사 : 혜지원");
        System.out.println("출간일 : 2014년06월");
        System.out.printf("정가 : %d원\n",price);
        System.out.printf("판매가 : %.0f원\n",sale);
        System.out.printf("할인율 : %d %%",dis);
        System.out.printf("적립금 : %.0f원\n",discnt);

        //-----------------------------------------------------

        int price1 = 199870;
        int oman = price1 / 50000;
        int ilman = (price1%50000) / 10000;
        int ochun = (price1%10000) / 5000;
        int ilchun = (price1%5000) / 1000;
        int obak = (price1%1000) / 500;
        int ilbak = (price1%500) / 100;
        int osib = (price1%100) / 50;
        int ilsib = (price1%50) / 10;

        System.out.printf("5만원권 : %d장\n",oman);
        System.out.printf("1만원권 : %d장\n",ilman);
        System.out.printf("5천원권 : %d장\n",ochun);
        System.out.printf("1천원권 : %d장\n",ilchun);
        System.out.printf("5백원 : %d개\n",obak);
        System.out.printf("1백원 : %d개\n",ilbak);
        System.out.printf("50원 : %d개\n",osib);
        System.out.printf("10원 : %d개\n",ilsib);

        //----------------------

        System.out.println("복권 3자리를 입력하세요");
        int lotto1 = sc.nextInt();
        int lotto2 = sc.nextInt();
        int lotto3 = sc.nextInt();

        String key = lotto1 == 35 && lotto2 == 25 && lotto3 == 12 ? "상금 1백만 지급\n" : "아쉽지만 다음기회에\n";
        System.out.printf(key);

        //----------------------------------

        // Scanner의 nextInt() 메서드를 호출한 후에 nextLine() 메서드를 호출하면
        // 입력 버퍼에 남아있는 개행문자(\n)를 읽어오는 문제입니다
        // 데이터 타입이 다른경우 생기는 문제로서 scanner의 타입을 문자열로 일치시켜
        // 그 후 데이터 타입을 형변환하여 사용하는 방법이 제일 빠른듯 하다.
        // 다른 방법으로는 문자열에 .next()를 사용하여 쓰는 것도 하나의 방법이다

        System.out.println("결혼여부");
        String marry = sc.next().replace(" ","");

        System.out.println("연봉 답해주세요");
        int salry = sc.nextInt();


        if (marry.equals("yes")){
            if(salry > 6000){
                double tax = salry * 0.35;
                System.out.println(tax);
            }if (salry < 6000) {
                double tax1 = salry * 0.15;
                System.out.println(tax1);
            }
        } else {
            if (salry > 3000) {
                double tax2 = salry * 0.25;
                System.out.println(tax2);
            }
            if (salry < 3000) {
                double tax3 = salry * 0.1;
                System.out.println(tax3);
            }
        }

        //--------------------------------------------------
        System.out.println("원하는 연도를 검색하세요");
        int year = sc.nextInt();

        boolean checkYear = year%4 == 0 && year%100 != 0 || year%400 ==0 ;
        String leapYear = checkYear ? "윤년":"윤년아님";
        System.out.println(leapYear);

        //----------------------------------------------

        System.out.println("원하시는 구구단을 입력해주세여");
        int num = sc.nextInt();
        if (10>num && num>0) {
            for (int i = 1; i<10; ++i ){
                int dan = num * i;
                System.out.printf("%d * %d = %d\n",num,i,dan);
            }
        }
        else {
            System.out.println("잘못입력하셨습니다.");
        }

        //--------------------------------------------

        // System.in.read를 쓰려면 java.io.IOException이 필요하고
        // try catch 구문이 필요하다. 물론 upperCase도 필요하다.

        System.out.println("원하는 소문자를 하나만 입력하세요");

        try {
            int input = System.in.read();

            if (!Character.isLowerCase(input)) {
                System.out.println("잘못 입력하셨습니다!!");
                return;
            }

            char va = Character.toUpperCase((char) input);
            System.out.println("대문자: " + va);
        }catch (IOException e) {
            e.printStackTrace();
        }

        //-----------------------------------------------

        // do while 구문으로 작성하면 된다

        int num2 = 35;
        int num1;

        System.out.println("1-100까지 숫자중에 아무거나 입력하세여");
        do{
            num1 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("정답보다 큽니다");
            }
            if (num1 < num2) {
                System.out.println("정답보다 작습니다");
            }
        }while (num1 != num2);

            System.out.println("빙고");

    }
}
