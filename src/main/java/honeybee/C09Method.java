package honeybee;

import java.util.Scanner;

public class C09Method {
    // 접근제한자 static 반환유형 메서드명(매개변수목록)
    public static void sayHello() {
        System.out.println("Hello,World!!");
    }
    // 메서드도 매개변수 사용할 수 있다.
    public static void sayHello2(String msg) {
        System.out.printf("Hello,%s!!\n",msg);
    }
    // return을 할때 반환유형이 데이터타입이랑 같아야한다.
    // return을 한 메서드를 void에서 호출하면 출력이 되지않는다.
    // void를 바꾸지 않을거라면 system.out.print(함수호출)형태로 작성해야한다.
    public static String sayHello3(String msg) {
        return String.format("Hello,%s!!\n",msg);
    }
    public static String computeLeapYear(int year) {

        String result = "평년입니다.";

        if (year%4 == 0 && year%100 != 0 || year%400 ==0){
            result = "윤년입니다.";
        }

        return String.format("입력하신 %s 연도는 %s\n",year,result);

    }
    public static String showAMPM(String time) {
        String select = time.substring(0,2);
        int check = Integer.parseInt(select);
        String result = "AM";
        if (check > 12) {
            result = "PM";
        }

        return String.format("현재 시간은 %s  %s\n",result,time);
    }
    public static String showPyramid(int floor) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < floor; i++) {
//            for (int j = 0; j <= i; j++) {
//                result.append("*");
//            }
//            result.append("\n");
//        }
//
//        return result.toString();

        String result = "";

        for (int i = 1; i <= floor; i++) {
           for (int j = 1; j <= i; j++) {
                result += "*";
           }
           result += "\n";
        }
        return result;
    }

    public static void readSungJuk(String[] stu,int[] kor,int[] eng,int[] math) {
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < stu.length; ++i) {
            System.out.print((i + 1) + "학생은? ");
            stu[i] = sc.next();
            kor[i] = sc.nextInt();
            eng[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
    }
    public static void checkSungJuk(String[] stu,int[] kor,int[] eng,int[] math,
                                        int[] tot1,double[] avg1,String[] grd) {
        for (int i = 0; i < stu.length; i++) {
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
        }
    }
    public static void printSungJuk(String[] stu,int[] kor,int[] eng,int[] math,int[] tot1,double[] avg1,String[] grd) {
            for (int i = 0; i < stu.length; i++) {
                System.out.printf("%s,%d,%d,%d,%d,%.1f,%s\n",stu[i],kor[i],eng[i],math[i],tot1[i],avg1[i],grd[i]);
            }

    }

    public static void main(String[] args) {
        // 메서드
        // 특정 작업(코드블록)을 여러번 반복해야 하는 경우
        // 해당 작업을 재사용 가능한 구조로 만들때 사용
        // 즉, 어떤 작업을 수행하기 위해
        // 필요한 코드들의 집합을 의미하고,
        // 이것들을 재사용하기 위해 모듈형태로 작성한 것

        // 메서드 호출
        sayHello();
        sayHello2("Java");
        System.out.println(sayHello3("HTML"));
        int year = 2020;
        System.out.println(computeLeapYear(year));
        String time = "17:17:17";
        System.out.println(showAMPM(time));
        int floor = 5;
        System.out.println(showPyramid(floor));


        // 성적 처리 프로그램
        //메서드로 기능을 모듈화 시켜 작성
        // 변수만 main에서 선언하여 인수로 적용하고
        // 호출하는 메서드에서 변수를 인자로 받아
        // 메서드안에서 동작하는 구문으로 만드는것
        // 리액트랑 비슷한 면이 있다. 다른 언어들도 마찬가지겠지만

        // 만약 추가 항목이 생겼다면 main에서 변수 생성하고 인자,인수 수정하고
        // 호출하는 메서드도 수정해야하기에 유지보수의 범위가 넓어진다.
        String[] stu = new String[3];
        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] math = new int[3];

        int[] tot1 = new int[3];
        double[] avg1 = new double[3];
        String[] grd = new String[3];

        readSungJuk(stu,kor,eng,math);
        checkSungJuk(stu,kor,eng,math,tot1,avg1,grd);
        printSungJuk(stu,kor,eng,math,tot1,avg1,grd);


        // 클래스 호출
        // 메서드 매개변수자리에 String[] args는 new String[]{} 작성하면 값을 받는다.
        // 근데 값을 받는지 않받는지 확인을 안해봤다.
        // for (int i = 0; i < args.length; i++) {
        //       System.out.println(args[i]);
        //     }  배열의 값을 확인하는 코드
        // 클래스로 호출하는 인자,인수도 변수로 만들어 사용하면 된다.
        String[] chat = new String[]{"Method","Loop","Array","Condition","Type","Scanner","Random"};

        Hello.main(chat);
    }
}
