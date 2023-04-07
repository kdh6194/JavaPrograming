package examples;
import java.sql.*;

public class EX00 {
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("연결이 안됨");
            System.exit(1);
        }

    }
// 오라클을 자바에 연결하기위해서는 jdbc라는 파일이 필요하고
    // 그리고 jdbc랑 jdk, 오라클 버전이 일치되거나 컴파일이 잘 이루어져야 한다.
    //


    public static void main(String[] args) {
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;

        try {
            String dbUrl = "jdbc:oracle:thin:13.125.199.59:1521:xe";
            con = DriverManager.getConnection(dbUrl, "hr", "hr");
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");

            while(rs.next()) {
                System.out.println(rs.getString("ename"));
            }
        } catch (SQLException e) {
            System.out.println("에러발생");
            System.exit(1);
        } finally {

            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                System.out.println("비정상적인 종료");
                System.exit(1);
            }
        }
    }
}
