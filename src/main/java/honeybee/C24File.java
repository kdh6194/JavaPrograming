package honeybee;

import java.io.*;

public class C24File {
    // 직렬화/역직렬화
    // JVM 내에 생성된 자바 객체 또는 데이터를
    // JVM 외부에서 사용할 수 있도록 바이트 형태로 변환하는 행위
    public static void main(String[] args) {
        Student2 std01 = new Student2(201350050,"김태희",
                "경기도 고양시","1985.3.22","컴퓨터",504);

        // 직렬화
        String fname = "c:/Java/student.obj";
        FileOutputStream fos = null;        // 파일 저장용
        ObjectOutputStream oos = null;      // 직렬화용
        // ByteArrayOutputStream baos = null;
        try{
            fos = new FileOutputStream(fname);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(std01); // 객체를 파일에 저장
            // toString()을 작성하면 에러가 발생

        } catch (Exception e){e.getMessage();}
            finally {
                if(oos != null) try {
                    oos.close();
                } catch (Exception ex) {}
                if(fos != null) try {
                    fos.close();
                } catch (Exception ex) {}
            }

        // 역직렬화
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Student2 readOne = null;

        try{
            fis = new FileInputStream(fname);
            ois = new ObjectInputStream(fis);

            readOne = (Student2) ois.readObject(); // 파일에 저장된 내용을 객체로 읽어옴

        } catch (Exception e){e.getMessage();}
        finally {
            if(ois != null) try {
                ois.close();
            } catch (Exception ex) {}
            if(fis != null) try {
                fis.close();
            } catch (Exception ex) {}
        }

        System.out.println(readOne.stuno);
        System.out.println(readOne.name);
        System.out.println(readOne);

    }
}
class Student2 implements Serializable {
    int stuno;
    String name;
    String addr;
    String bth;
    String dept;
    int prof;

    public Student2(int stuno, String name, String addr, String bth, String dept, int prof) {
        this.stuno = stuno;
        this.name = name;
        this.addr = addr;
        this.bth = bth;
        this.dept = dept;
        this.prof = prof;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %s %d\n";
        return String.format(fmt, stuno, name, addr, bth, dept, prof);
    }
}