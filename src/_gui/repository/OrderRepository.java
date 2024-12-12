package _gui.repository;

import _gui.JDBCConnector;
import _gui.entity.OrderEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderRepository {
    public ArrayList<OrderEntity> getOrderList(String searchWord) {
        ArrayList<OrderEntity> orderList = new ArrayList<>();
        Connection con = JDBCConnector.getConnection(); // 메서드 호출 시마다 연결 생성
        if (con == null) {
            System.out.println("데이터베이스 연결이 초기화되지 않았습니다.");
            return orderList;
        }

        String sql = "SELECT 주문번호, 고객이름, 제품명, 수량, 배송지, 주문일자 " +
                "FROM 주문 o, 고객 c, 제품 p " +
                "WHERE o.주문고객 = c.고객아이디 AND o.주문제품 = p.제품번호 AND c.고객이름 LIKE ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "%" + searchWord + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    OrderEntity orderEntity = new OrderEntity();
                    orderEntity.setOrderNum(rs.getString("주문번호"));
                    orderEntity.setCustomerName(rs.getString("고객이름"));
                    orderEntity.setProductName(rs.getString("제품명"));
                    orderEntity.setAmout(rs.getInt("수량"));
                    orderEntity.setDestination(rs.getString("배송지"));
                    orderEntity.setOrderDate(rs.getTimestamp("주문일자"));
                    orderList.add(orderEntity);
                }
            }
        } catch (SQLException e) {
            System.out.println("주문 목록 조회 중 오류 발생: " + e.getMessage());
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("DB 연결 종료 중 오류 발생: " + e.getMessage());
            }
        }
        return orderList;
    }

    public void insertOrder(OrderEntity orderEntity) {
        String sql = "INSERT INTO 주문 VALUES (?, ?, ?, ?, ?, ?)";
        Connection con = JDBCConnector.getConnection();
        if (con == null) {
            System.out.println("데이터베이스 연결이 초기화되지 않았습니다.");
            return;
        }

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, orderEntity.getOrderNum());
            pstmt.setString(2, orderEntity.getOrderCustomer());
            pstmt.setString(3, orderEntity.getOrderProduct());
            pstmt.setInt(4, orderEntity.getAmout());
            pstmt.setString(5, orderEntity.getDestination());
            pstmt.setTimestamp(6, orderEntity.getOrderDate());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("주문 추가 중 오류 발생: " + e.getMessage());
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("DB 연결 종료 중 오류 발생: " + e.getMessage());
            }
        }
    }
}
