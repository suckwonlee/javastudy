package _gui.view;

import _gui.entity.OrderEntity;
import _gui.repository.OrderRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class OrderInfoView extends JPanel {
    JTextField tfSearch = new JTextField(20);
    DefaultTableModel tableModel; // 테이블 모델 선언
    JTable table;
    String[] header = {"주문번호", "주문고객", "주문제품", "수량"};

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();

    public OrderInfoView() {
        setLayout(new BorderLayout());
        JPanel panN = new JPanel(new GridLayout(2, 1));
        JPanel panC = new JPanel(new BorderLayout(5, 20));

        panN.add(pan1);
        panN.add(pan2);

        add(panN, BorderLayout.NORTH);
        add(panC, BorderLayout.CENTER);

        addPan1();
        addPan2();
        addTable(panC);
        initList("");
    }

    public void addPan1() {
        JLabel lblTitle = new JLabel("정보검색프로그램");
        pan1.add(lblTitle);
        // DefaultTableModel 초기화
        tableModel = new DefaultTableModel(header, 15) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 셀 편집 금지
            }
        };
    }

    public void addPan2() {
        JLabel lblSearch = new JLabel("검색어");
        JButton btnSearch = new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }

    public void addTable(JPanel panC) {
        // 테이블 초기화 및 연결
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        panC.setLayout(new BorderLayout());
        panC.add(scrollPane, BorderLayout.CENTER);
    }

    public void setList(String searchWord) {
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(searchWord); // searchWord 전달

        tableModel.setRowCount(0);

        for (OrderEntity orderEntity : orderList) {
            Object[] rowData = {
                    orderEntity.getOrderNum(),
                    orderEntity.getCustomerName(),
                    orderEntity.getProductName(),
                    orderEntity.getAmount(),
                    orderEntity.getDestination()
            };
            tableModel.addRow(rowData);
        }
    }

    public void initList(String searchWord){
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(searchWord); // searchWord 전달

        tableModel.setRowCount(0);

        for (OrderEntity orderEntity : orderList) {
            Object[] rowData = {
                    orderEntity.getOrderNum(),
                    orderEntity.getCustomerName(),
                    orderEntity.getProductName(),
                    orderEntity.getAmount(),
                    orderEntity.getDestination()
            };
            tableModel.addRow(rowData);
        }
    }



}

