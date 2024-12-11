package _gui.controller;

import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int Frame_WIDTH = 700;
    public static final int Frame_Height = 500;

    public MainFrame() {
        super("정보검색프로그램");
        setSize(Frame_WIDTH, Frame_Height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int Frame_X = (dim.width - Frame_WIDTH) / 2;
        int Frame_Y = (dim.height - Frame_Height) / 2;
        setLocation(Frame_X, Frame_Y);

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView, BorderLayout.CENTER);

        // 전체 데이터를 조회하기 위해 빈 문자열 전달
        orderInfoView.setList("");

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();

    }}