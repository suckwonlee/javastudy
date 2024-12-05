package _gui.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class OrderInfoView extends JPanel {
    JTextField tfSearch = new JTextField(20);
    DefaultTableModel model;
    JTable table;
    String[] header = {"주문번호", "주문고객", "주문제품", "수량"};

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();

    public OrderInfoView() {
        setLayout(new BorderLayout());
        JPanel panN = new JPanel(new GridLayout(2, 1));
        JPanel panC = new JPanel();

        panN.add(pan1);
        panN.add(pan2);

        add(panN, "North");
        add(panC, "Center");

        addPan1();
        addPan2();
        addTable(panC);
    }

    public void addPan1() {
        JLabel lblTitle = new JLabel("정보검색프로그램");
        pan1.add(lblTitle);
        model = new DefaultTableModel(header, 15){
          @Override
          public boolean isCellEditable(int row, int column) {
              return false;
          }
        };
    }

    public void addPan2() {
        JLabel lblSearch = new JLabel("검색어");
        JButton btnSearch = new JButton("검색");
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }

    public void addTable(JPanel panC) {
        model = new DefaultTableModel(header, 15);
        table = new JTable(model);
        panC.add(table);
        JScrollPane scrollPane = new JScrollPane(table);
        panC.setLayout(new BorderLayout());
        panC.add(scrollPane, BorderLayout.CENTER);
    }
}
