package honeybee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C29JDBC {
    private static String deleteBookSQL = "delete from newbooks where bookno = ?";
    public static void main(String[] args) {
        // newbooks 테이블에서 입력받은 도서번호를 이용해서 레코드 삭제
        // 삭제할 도서번호 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 도서번호는?");
        int bookno = sc.nextInt();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = C31JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(deleteBookSQL);
            pstmt.setInt(1,bookno);

            // SQL문 실행 후 결과 확인
            int del = pstmt.executeUpdate();  // DML 실행시 사용
            System.out.println("데이터 삭제확인 : "+ del);


        } catch (SQLException e) {
            System.out.println("db 주소나 아이디/비밀번호를 확인하세요");
        }finally {
            // static으로 선언된 메서드는
            // 객체 생성 없이 바로 호출 가능
            // 단, 클래스명.메서드명으로 호출해야함

            C31JDBCUtil.closeConn(null,pstmt,conn);
        }


    }
}
class Book3 {
    private int bookno;
    private String title;
    private String writer;
    private int price;
    private String regdate;
    public Book3() {}
    public Book3(int bookno, String title, String writer, int price, String regdate) {
        this.bookno = bookno;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.regdate = regdate;
    }

    public int getBookno() {
        return bookno;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public int getPrice() {
        return price;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %d %s";
        return String.format(fmt,bookno,title,writer,price,regdate);
    }
}