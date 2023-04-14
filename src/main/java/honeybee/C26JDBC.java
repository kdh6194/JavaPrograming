package honeybee;

import sun.net.ConnectionResetException;

import java.sql.*;
import java.util.Scanner;

public class C26JDBC {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.cclckhepzkvp.ap-northeast-2.rds.amazonaws.com:3306/fulstacks";
    private static String USR = "admin";
    private static  String PWD = "fullstack_2023";

    private static String insertBookSQL = "insert into newbooks(title, writer, price) values (?, ?, ?)";
    private static String selectBookSQL = "select * from newbooks ";


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("도서명은? ");
//        String title = sc.next();
//        System.out.print("저자는? ");
//        String writer = sc.next();
//        System.out.print("가격은? ");
//        int price = sc.nextInt();

        try {
          Class.forName(DRV);
        } catch (Exception e) {
            System.out.println("mariadb 용 JDBC 드라이버가 없어요!");
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;


        try {
            conn = DriverManager.getConnection(URL,USR,PWD);
            //pstmt = conn.prepareStatement(insertBookSQL);
            pstmt = conn.prepareStatement(selectBookSQL);


            // SQL문 실행 후 결과 확인
//            int cnt = pstmt.executeUpdate(); // DML 실행시 사용
//            System.out.println("데이터 입력확인" + cnt);

            // SQL문 실행후 결과집합 받음
            rs = pstmt.executeQuery();  // DML 실행시 사용
            while(rs.next()){  // getInt에서 해당컬럼의 순서 또는 컬럼명을 작성
                System.out.println(rs.getInt("bookno")+" ");
                System.out.println(rs.getString("title")+" ");
                System.out.println(rs.getString("writer")+" ");
                System.out.println(rs.getInt("price")+"\n");
            }

        } catch (SQLException e) {
            System.out.println("db 주소나 아이디/비밀번호를 확인하세요");
        }finally {
            if (rs != null) try{rs.close();} catch(Exception ex){}
            if (pstmt != null) try{pstmt.close();} catch(Exception ex){}
            if (conn != null) try{conn.close();} catch(Exception ex){}
        }

    }
}
class newbooks {
    private int bookno;
    private String title;
    private String writer;
    private int price;
    private String regdate;
    public newbooks() {}
    public newbooks(int bookno, String title, String writer, int price, String regdate) {
        this.bookno = bookno;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%s,%d,%d,%s,%d";
        return String.format(fmt,bookno,title,writer,price,regdate);
    }
}