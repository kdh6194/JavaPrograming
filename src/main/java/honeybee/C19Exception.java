package honeybee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C19Exception {

        // 예외exception와 오류
        // 자바프로그램 작성시 문법에 맞지 않게 코드를 작성하면
        // 컴파일 오류가 발생함
        // 또한, 코드가 제대로 작성되었다 하더라도 실행중에
        // 예상치 못한 상황으로 실행 오류가 발생할 수 있음
        // 이처럼 프로그램 실행중에 예상치 못한 상황으로
        // 프로그램이 영향을 받는 것을 오류와 예외로 구분

        //일반적으로 오류error는 시스템 단계에서 프로그램에 심각한 문제를
        // 야기해서 실행중인 프로그램을 강제 중단시킴
        // -> 네트워크 상 접속 오류, 메모리 부족
        // 이러한 에러는 개발자가 처리할 수 없음

        // 반면, 예외는 에러와 마찬가지로 실행중인 프로그램을 중단시키지만
        // 발생할 수 있는 상황을 미리 예측하여 코드를 통해
        // 프로그램 실행 중단을 방지할수 있음

    public static void main(String[] args) {

        // 예외 처리 전1
        System.out.println("프로그램 시작1");
        System.out.println("프로그램 끝1");
        System.out.println("-------------------");

        // 예외 처리 전2
        System.out.println("프로그램 시작2");
        int a = 10, b = 20;
        int c = a + b;
        System.out.println(c);
        System.out.println("프로그램 끝2");
        System.out.println("-------------------");

        // 예외 처리 전3
        //System.out.println("프로그램 시작3");
        //int d = 10, e = 0;
        //int f = d / e;          // 예외 발생 - 실행 중단
        //System.out.println(f);
        //System.out.println("프로그램 끝3");
        //System.out.println("-------------------");

        // 예외 처리 전4a
        // try
        //      예외 발생 가능성이 있는 코드
        // catch()
        //      예외 처리 핸들러
        try{
            System.out.println("프로그램 시작4a");
            int g = 10, h = 0;
            int i = g / h;          // 예외 발생 - 실행 중단
            System.out.println(i);
            System.out.println("프로그램 끝4a");
            System.out.println("-------------------");
        }catch (Throwable dashException){
            System.out.println("에러 발생 - 코드를 수정하세요!");
            dashException.printStackTrace();
            System.out.println("-------------------");
        }

        // ex) 1 ~ 9 사이 정수만 입력받아 화면에 출력하는 코드 작성
        // 단, 예외 처리코드를 이용해서 문자를 입력했을때에는
        // 1 ~ 9 사이 정수만 입력가능합니다 라고 출력
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println(" 1 ~ 9 사이 숫자를 입력하세요");
            int num = sc.nextInt();
            try {
                if (num > 0 && num < 10) {
                    System.out.println(num + " / 확인되었습니다");
                } else {
                    System.out.println("1 ~ 9 사이 정수만 입력가능합니다");
                }
            } catch (Exception ex) {
                System.out.println("1 ~ 9 사이 정수만 입력가능합니다");
                System.out.println(ex.getMessage());
            }
            System.out.println("-------------------");
        }
        // 예외가 잡는 에러는 입력 받는 데이터의 타입이 맞지 않거나
        // 동작이 성립하지 않는 데이터를 입력한 경우 등 이러할때만 예외 처리 발생
        // 사용자에 의한 오류(계산 실수, 설정 범위이상 입력)들이 있는 경우는
        // 다르게 런타임 에러를 처리를 해야하는 것 같다.


        // 예외 처리 4b

        for (int i = 0; i <= 5; i++) {
            System.out.println(" 1 ~ 9 중 마음에 드는 숫자를 입력하세요");
            int num = sc.nextInt();
            try {
                if (num > 0 && num < 10) {
                    System.out.println(num + " / 확인되었습니다");
                } else {
                    System.out.println("1 ~ 9 사이 정수만 입력가능합니다");
                }
            } catch (ArithmeticException ex) { // 특정 상황에 맞는 구체적 예외
                System.out.println("숫자를 입력하세요");
            }
            System.out.println("-------------------");
        }

        // ex) 학생3명의 이름을 입력받아 화면에 출력하는 코드를 작성하세요
        // 단, 학생수를 초과해서 입력했을 때 발생하는 예외도 처리함!!

        String[] names = new String[3];
        System.out.println("학생 수를 입력하세요");
        int select = sc.nextInt();
        try{
                for (int i = 0; i < select; i++) {
                    System.out.println("이름을 작성해주세요");
                    names[i] = sc.next();
                }
        }catch (ArithmeticException ex){
            System.out.println("학생 수를 초과했습니다!");
        }
        System.out.println(Arrays.toString(names));

        // 예외종류
        // 검사형 예외 : checked exception
        // 비검사형 예외 : unchecked exception

        // 비검사형 예외
        // 명시적인 예외처리를 강제하지 않음
        // 예외발생 확인 시점은 실행시임
        // ArithmeticException
        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        // 검사형 예외
        // 명시적인 예외처리를 강제함 (반드시!)
        // 예외발생 확인 시점은 컴파일시임
        // IOException
        // ClassNotFoundException
        // 단, 검사형 예외를 피하고 싶으면
        // throws를 이용해서 예외처리를 외부로 떠넘기면 됨

        // sungjuk.data 파일을 읽어서 화면에 출력
        // 메서드 시그니처는 콜 시그니처를 메인 메서드 옆에 작성하는거라 생각하면 편함
        File f = new File("c:/Java/sungjuk.data");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("읽어들일 파일이 존재하지 않습니다!");
        }

        // 예외를 시그니처에 추가하면 상속받거나 인터페이스가 연결되어있다면
        // 되게 구문이 길어지니 그냥 try-catch에 작성하자

        // 예외 처리 5
        // 사용자 정의 예외 - 개발자 입맛에 맞는 예외메세지 출력 가능
        // 사용자 정의 예외는 Exception 클래스를 상속해서 만들어야 함

        for (int i = 0; i <= 3; i++) {
            System.out.println(" !!1 ~ 9 사이 숫자를 입력하세요");
            int num = sc.nextInt();
            try {
                 try{
                    if (num > 0 && num < 10) {
                        System.out.println(num + " / 확인되었습니다");
                    }
                 }catch (Exception ex) {
                     throw new ZeroDivideException("1 ~ 9 사이 정수만 입력가능합니다");
                 }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("-------------------");
        }



    }
}
// alt + insert키 를 누르면 생성자를 쉽게 만들 수 있다.

// 사용자 정의 예외 - 0으로 나누려고할 때 발생하는 예외에 대한 예외클래스
class ZeroDivideException extends Exception {
    public ZeroDivideException(String message) {
        super(message);
    }
}