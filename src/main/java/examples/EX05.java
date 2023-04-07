package examples;

import java.util.Arrays;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student std1 = new Student(
                "201350050","김태희","경기도고양시","1985.3.22","컴퓨터"
        );
        System.out.printf("학번 : %s,이름 : %s,주소 : %s,생년월일 : %s,학과명 : %s\n",std1.stuno,std1.name,std1.address,std1.bth,std1.dept);

        Professor p1 = new Professor(
                "301","이순신","프로그래밍"
        );
        System.out.printf("교수번호 : %s,이름 : %s,전공명 : %s\n",p1.prono,p1.name,p1.pro);

//        밑에 코드는 문자열을 받고 배열에 문자 형태로 저장하는 방식
//        ex) 입력 받은 문자열 : asdf => 출력 : a,s,d,f 이런식으로 출력이 된다
//        StringBuilder chat = new StringBuilder();
//        for (int i = 0; i < 5; i++) {
//            String input = sc.nextLine();
//            chat.append(input);
//        }
//        String change = chat.toString();
//        char[] info = change.toCharArray();
//        for (char chats : info){
//            System.out.println(chats);
//        }


        // 입력 받은 문자열을 배열로 바꾸어 저장하고 출력하는 방식
        System.out.println("학생 수 입력");
        int num = sc.nextInt();
        String[] chat = {};
        for (int i = 0; i < num; i++) {
            System.out.println("학번,이름,주소,생년월일,학과명을 작성하세요");
            String input = sc.next();
            chat = input.split(",");
        }System.out.println(Arrays.toString(chat));


    }
}
// 학생 정보 클래스
class Student{
    String stuno;
    String name;
    String address;
    String bth;
    String dept;
    public Student(String stuno,String name,String address,String bth,String dept){
        this.stuno =stuno;
        this.name =name;
        this.address =address;
        this.bth =bth;
        this.dept =dept;
    }
}
// 교수 정보 클래스
class Professor{
    String prono;
    String name;
    String pro;
    public Professor(String prono,String name,String pro){
        this.prono =prono;
        this.name =name;
        this.pro =pro;
    }
}