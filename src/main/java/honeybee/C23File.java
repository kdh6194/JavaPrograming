package honeybee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C23File {
    public static void main(String[] args) {
        // 학번,이름,주소,생년월일,학과명,교수등으로
        // 구성된 객체 데이터를 students.dat 에 저장

        Student std01 = new Student(201350050,"김태희",
                "경기도 고양시","1985.3.22","컴퓨터",504);

        // 학생정보 저장용 파일 지정
        String fname = "c:/Java/students.dat";
        // 주소만 저장되어있음
        System.out.println(std01);

        // 학생정보 파일에 저장
        FileWriter fw = null;
        try {
            fw = new FileWriter(fname);
            fw.write(std01.toString());
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            if (fw != null )try {fw.close();}catch (Exception ex) {}
        }

        // 파일에 저장된 학생정보를 읽어서 변수(stdinfo)에 저장
        BufferedReader br = null;
        FileReader fr = null;
        String stdinfo = "";

        try{
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            while(br.ready()){
                stdinfo = br.readLine();
            }

        }catch (Exception ex) {}finally {
            if(br != null) try {
                br.close();
            } catch (Exception ex) {}
            if(br != null) try {
                fr.close();
            } catch (Exception ex) {}
        }

        // 변수에 저장된 학생정보를 출력
        System.out.println(stdinfo);

        // 변수에 저장된 학생정보를 출력

        // 공백으로 배열에 저장하니 배열이 하나씩 밀려남
        // split 사용시 ,아니면 .을 사용하여 구분하는게 좋음
        String[] std = stdinfo.split(",");
        System.out.println("학번 : "+std[0]);
        System.out.println("이름 : "+std[1]);
        System.out.println("주소 : "+std[2]);
        System.out.println("생년월일 : "+std[3]);
        System.out.println("학과 : "+std[4]);
        System.out.println("교수 : "+std[5]);

        // 객체의 멤버변수 성질을 잃어버린채
        // 모두 문자형으로 출력됨

    }
}

class Student {
    int stuno;
    String name;
    String addr;
    String bth;
    String dept;
    int prof;

    public Student(int stuno, String name, String addr, String bth, String dept, int prof) {
        this.stuno = stuno;
        this.name = name;
        this.addr = addr;
        this.bth = bth;
        this.dept = dept;
        this.prof = prof;
    }

    @Override
    public String toString() {
        String fmt = "%d,%s,%s,%s,%s,%d\n";
        return String.format(fmt, stuno, name, addr, bth, dept, prof);
    }
}