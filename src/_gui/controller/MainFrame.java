package _gui.controller;

import _gui.view.OrderInfoView;
import _gui.repository.OrderRepository;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int FRAME_WIDTH = 900;
    public static final int FRAME_Height = 500;

    public int frameX = 300;
    public int frameY = 200;

    public MainFrame() {
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double sw = dimension.getWidth();
        double sh = dimension.getHeight();

        frameX = (int)((0.5)*(sw - FRAME_WIDTH));
        frameY = (int)((0.5)*(sh - FRAME_Height));

        OrderRepository orderRepository = new OrderRepository();

        // OrderInfoView 생성 시 OrderRepository 전달
        OrderInfoView orderInfoView = new OrderInfoView(orderRepository);
        add(orderInfoView, "Center");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(frameX, frameY);
        setSize(FRAME_WIDTH, FRAME_Height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
