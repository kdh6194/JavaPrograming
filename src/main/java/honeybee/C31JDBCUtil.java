package honeybee;

import java.sql.*;

public class C31JDBCUtil {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.cclckhepzkvp.ap-northeast-2.rds.amazonaws.com:3306/fulstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";


    // static으로 선언된 메서드는
    // 객체 생성 없이 바로 호출 가능
    // 단, 클래스명.메서드명으로 호출해야함
    // 객체가 생성되는 시점이 컴파일때 생성됨
    // 런타임에서 생성되는 것이 아니다
    // 보통 공유(참조)용으로 만든다 생각해라
    // 클래스 객체라고도 부를 수 있다.

    // 데이터베이스 접속 객체 생성
    public static Connection makeConn() {
        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("mariadb 용 JDBC 드라이버가 없어요!");
        } catch (SQLException e) {
            System.out.println("db 주소나 아이디/비밀번호를 확인하세요");
        }

        return conn;
    }

    //데이터베이스 접속 객체 해제
    public static void closeConn(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if (rs != null) try{rs.close();} catch(Exception ex){}
        if (pstmt != null) try{pstmt.close();} catch(Exception ex){}
        if (conn != null) try{conn.close();} catch(Exception ex){}
    }


}
