package jdbc2.Controller;

import jdbc.JDBCConnector;
import jdbc2.entity.Customer;
import jdbc2.view.CustomerView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //연결객체를 반환받는다.
        Connection con= JDBCConnector.getConnection();
        //문장객체 반환
        String sql="select * from 고객";
        PreparedStatement pstmt=null;
        ArrayList<Customer> customerList=new ArrayList<Customer>();
        Customer customer=null;
        try{pstmt = con.prepareStatement(sql);
            ResultSet result=pstmt.executeQuery();
            while(result.next()){
                customer=new Customer();
                customer.setCustomerName(result.getString("고객이름"));
                customer.setCustomerID(result.getString("고객아이디"));
                customer.setAge(result.getInt("나이"));
                customer.setLevel(result.getString("등급"));
                customer.setJob(result.getString("직업"));
                customer.setReward(result.getInt("적립금"));
                customerList.add(customer);
                //반복종료시 모든 고객 정보가 어레이리스트에 저장됨
            }
            pstmt.close();
            con.close();
    }catch(SQLException e){
            System.out.println(e);
        }
        //view로 출력
        CustomerView view=new CustomerView();
        for( Customer custom: customerList ){
            view.printCustomer(custom);

        }
    }
}
