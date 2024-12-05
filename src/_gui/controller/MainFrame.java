package _gui.controller;

import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int Frame_WIDTH = 600;
    public static final int Frame_Height = 500;

    public MainFrame() {
        super("정보검색프로그램");
        setSize(Frame_WIDTH, Frame_Height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 화면 중앙에 위치 설정
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int Frame_X = (dim.width - Frame_WIDTH) / 2;
        int Frame_Y = (dim.height - Frame_Height) / 2;
        setLocation(Frame_X, Frame_Y);

        // OrderInfoView 추가
        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
