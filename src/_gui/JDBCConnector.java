package _gui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {


        private static Connection con;
        private static final String URL="jdbc:oracle:thin:@localhost:1521/xe";
        private static final String USER_NAME="system";
        private static final String PASSWORD="1234";

        public static Connection getConnection() {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("JDBC Driver 정상 로딩 성공~");
                con= DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                System.out.println("Oracle DB와 연결 성공~");
            } catch (ClassNotFoundException e) {
                System.out.println("Oracle JDBC Driver를 로드하지 못했습니다.!!!");
            } catch (SQLException e) {
                System.out.println("Oracle DB와 연결이 되지 않았습니다!!!");
            }

            return con;
        }
    }

