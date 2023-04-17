package honeybee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class C30JDBC {
    private static String updateBookSQL = "update newbooks set title = ? , writer = ? , price = ? where bookno = ?";
    public static void main(String[] args) {
        // newbooks 테이블에서 입력받은
        // 도서정보(도서번호, 도서명, 저자, 가격)를
        // 이용해서 레코드 수정

        // 수정할 도서번호 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 도서번호는?");
        int bookno = sc.nextInt();
        System.out.println("수정할 도서이름은?");
        String title = sc.next();
        System.out.println("수정할 저자는?");
        String writer = sc.next();
        System.out.println("수정할 가격은?");
        int price = sc.nextInt();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = C31JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(updateBookSQL);
            // 두번째 인자는 데이터베이스에 컬럼명이 아니라 입력받는 변수명을 받아와야한다.
            // 그리고 ? 순서에 따라서 값을 넣어줘야 한다. 입력받는 순서가 아니다.
            pstmt.setString(1,title);
            pstmt.setString(2,writer);
            pstmt.setInt(3,price);
            pstmt.setInt(4,bookno);

            // SQL문 실행 후 결과 확인
            int del = pstmt.executeUpdate();  // DML 실행시 사용
            System.out.println("데이터 수정확인 : "+ del);


        } catch (SQLException e) {
            System.out.println("db 주소나 아이디/비밀번호를 확인하세요");
        }finally {
            C31JDBCUtil.closeConn(null,pstmt,conn);
        }


    }
}
class Book4 {
    private int bookno;
    private String title;
    private String writer;
    private int price;
    private String regdate;
    public Book4() {}
    public Book4(int bookno, String title, String writer, int price, String regdate) {
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