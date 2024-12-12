package _gui.view;

import _gui.entity.OrderEntity;
import _gui.repository.OrderRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Timestamp;
import java.util.ArrayList;

public class OrderInfoView extends JPanel {
    private final OrderRepository orderRepository;
    private final DefaultTableModel tableModel;
    private final JTable table;
    private final JTextField tfSearch;

    public OrderInfoView(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;

        setLayout(new BorderLayout(5, 20)); // 레이아웃 설정
        JPanel panN = new JPanel(new GridLayout(2, 1));
        JPanel panC = new JPanel(new BorderLayout(5, 20));
        initList("");
        // 상단 패널 구성
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        panN.add(pan1);
        panN.add(pan2);

        JLabel lblTitle = new JLabel("검색 프로그램");
        pan1.add(lblTitle);

        JLabel lblSearch = new JLabel("검색어: ");
        tfSearch = new JTextField(20);
        JButton btnSearch = new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String searchWord = tfSearch.getText();
                initList(searchWord);
            }
        });
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);

        // 테이블 설정
        String[] header = {"주문번호", "주문고객", "주문제품", "수량", "배송지", "주문일자"};
        tableModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 테이블 셀 비활성화
            }
        };

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(180);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(200);
        columnModel.getColumn(5).setPreferredWidth(100);


        // 중앙 패널 구성
        panC.add(scrollPane, "Center");
        add(panN, "North");
        add(panC, "Center");

        // 주문 추가 패널
        addOrderInfo(panC);

        // 초기 데이터 로드
        initList("");
        panC.add(scrollPane, "Center");
        add(panN, "North");
        add(panC, "Center");
    }

    public void initList(String searchWord) {
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(searchWord);
        tableModel.setRowCount(0); // 기존 데이터 초기화
        for (OrderEntity orderEntity : orderList) {
            tableModel.addRow(new Object[]{
                    orderEntity.getOrderNum(),
                    orderEntity.getCustomerName(),
                    orderEntity.getProductName(),
                    orderEntity.getAmout(),
                    orderEntity.getDestination(),
                    orderEntity.getOrderDate()
            });
        }
    }

    public void addOrderInfo(JPanel panC) {
        JPanel addPanel = new JPanel(new GridLayout(3, 1));
        JLabel title = new JLabel("주문 정보 입력", JLabel.CENTER);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        addPanel.add(title);
        addPanel.add(p1);
        addPanel.add(p2);

        String[] lblStrs = {"주문번호:", "고객아이디:", "제품번호:", "수량:", "배송지:", "주문일자:"};
        JLabel[] lbls = new JLabel[lblStrs.length];
        JTextField[] texts = new JTextField[lblStrs.length];
        for (int i = 0; i < lbls.length; i++) {
            lbls[i] = new JLabel(lblStrs[i]);
            texts[i] = new JTextField(20);
            if (i < 3) {
                p1.add(lbls[i]);
                p1.add(texts[i]);
            } else {
                p2.add(lbls[i]);
                p2.add(texts[i]);
            }
        }

        JButton btnAdd = new JButton("주문추가");
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    OrderEntity orderEntity = new OrderEntity();
                    orderEntity.setOrderNum(texts[0].getText());
                    orderEntity.setOrderCustomer(texts[1].getText());
                    orderEntity.setOrderProduct(texts[2].getText());
                    orderEntity.setAmout(Integer.parseInt(texts[3].getText()));
                    orderEntity.setDestination(texts[4].getText());
                    orderEntity.setOrderDate(Timestamp.valueOf(texts[5].getText()));

                    orderRepository.insertOrder(orderEntity);
                    initList(""); // 데이터 갱신
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "오류 발생: " + ex.getMessage());
                }
            }
        });
        p2.add(btnAdd);

        panC.add(addPanel, "South");
    }
}
