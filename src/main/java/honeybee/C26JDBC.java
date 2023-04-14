package honeybee;

import sun.net.ConnectionResetException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class C26JDBC {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.cclckhepzkvp.ap-northeast-2.rds.amazonaws.com:3306/fulstacks";
    private static String USR = "admin";
    private static  String PWD = "fullstack_2023";

    private static String insertBookSQL = "insert into newbooks(title, writer, price) values (?, ?, ?)";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("도서명은? ");
        String title = sc.next();
        System.out.print("저자는? ");
        String writer = sc.next();
        System.out.print("가격은? ");
        int price = sc.nextInt();

        try {
          Class.forName(DRV);
        } catch (Exception e) {
            System.out.println("mariadb 용 JDBC 드라이버가 없어요!");
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(URL,USR,PWD);
            //실행할 SQL문 생성
            pstmt = conn.prepareStatement(insertBookSQL);
            // 실행할 SQL문의 placeholder에 값 전달
            pstmt.setString(1,title);
            pstmt.setString(2,writer);
            pstmt.setInt(3,price);
            // SQL문 실행 후 결과 확인
            int cnt = pstmt.executeUpdate(); // DML 실행시 사용
            System.out.println("데이터 입력확인" + cnt);

        } catch (SQLException e) {
            System.out.println("db 주소나 아이디/비밀번호를 확인하세요");
        }finally {
            if (pstmt != null) try{pstmt.close();} catch(Exception ex){}
            if (conn != null) try{conn.close();} catch(Exception ex){}
        }

    }
}
