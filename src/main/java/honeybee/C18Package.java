package honeybee;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class C18Package {
    public static void main(String[] args) {
        // Math 클래스
        int a = 4, b = 10, c = 1;
        double d = 4.51, e = 5.41;

        System.out.println(Math.max(a,b)+ "/" + Math.max(b,c));
        System.out.println(Math.min(b,c)+ "/" + Math.min(a,b));

        System.out.println(Math.round(d) + "/" + Math.round(e));  //반올림
        System.out.println(Math.ceil(d) + "/" + Math.ceil(e));    //올림
        System.out.println(Math.floor(d) + "/" + Math.floor(e));  // 내림

        double r = Math.random();
        System.out.println(r);
        System.out.println((int)(r*5));      // 0~4  난수
        System.out.println((int)(r*10));     // 0~9  난수
        System.out.println(((int)(r*5))+1);  // 1~5  난수
        System.out.println(((int)(r*10))+1); // 1~10 난수

        // 1 ~ 45 사이 임의의 난수 6개 생성
        //  -> 주의점:난수 변수를 같이 돌려야 값이 하나로 통일하지않음
        for (int i = 1; i <= 6 ; i++) {
            r = Math.random();
            System.out.print(((int)(r*45))+1+" ");
        }
        System.out.println("\n");
        // String 클래스
        // ex) 파일명이 abc123.png라 할때 파일명과 확장자를 분리해서 출력

//        String filename = "abc123.png";
        String filename = "abc123xyz.jpeg"; // 파일명이 바뀐다면 기존 작업이 무용지물


       String fname = filename.substring(0,filename.indexOf('.')); // 파일명 출력
       String ext = filename.substring(filename.indexOf('.')+1); // 확장자 출력
        // String fname = filename.substring(0,6);         // abc123 출력시
        // String ext = filename.substring(6); // .png 출력시

        System.out.println(fname +" / "+ ext);

        String[] names = filename.split("[.]");
        System.out.println(Arrays.toString(names)); // Arrays.toString을 통해 배열을 출력

        // StringBuilder (동기화X) > StringBuffer (동기화0)
        // 하지만, 실무에서는 StringBuffer를 주로 사용
        // 문자열 합치기 : + , StringBuilder, StringBuffer
        // + : 내부적으로 StringBuilder를 이용해서 처리
        // 하지만 긴 문자열을 작성할때는 다른것을 사용하는게 좋다.

        // Date 클래스
        Date today = new Date();
        System.out.println(today);

        //Calrendar 클래스
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime()); // Date를 쓴것 처럼 날짜 출력
        System.out.println(cal.get(Calendar.YEAR)+cal.get((Calendar.MONTH)+1)+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR)+cal.get((Calendar.MINUTE))+cal.get(Calendar.SECOND)+cal.get(Calendar.AM_PM));

        // SimpleDateFormat 클래스
        // 날짜나 시간 표시를 좀 더 편하게 다루기 위해 사용
        // 확실히 위에 두개 보다 훨씬 좋아 보인다.
        String dfmt = "yyyy-MM-dd";// 년월일
        String tfmt = "a HH:mm:ss E";  // 시분초
        SimpleDateFormat sdf = new SimpleDateFormat(dfmt);
        System.out.println(sdf.format(today));
        sdf = new SimpleDateFormat(tfmt);
        System.out.println(sdf.format(today));

        // Random 클래스
        Random rdm = new Random();

        //래퍼 클래스
        //기본자료형 데이터를 클래스형 데이터로 취급할때 사용하는 클래스
        // 기본 자료형을 객체로 변환하여 사용
        int f = 1;
        System.out.println(f);

        Integer g = new Integer(f);  // 박싱: 기본형 -> 클래스형
        System.out.println(g.toString());

        int h = g.intValue();
        System.out.println(h);  // 언박싱 : 클래스형 -> 기본형
    }
}
