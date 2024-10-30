package jdbc3.controller;

import jdbc.JDBCConnector;
import jdbc3.entity.Product;
import jdbc3.repository.ProductRepository;
import jdbc3.view.productView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        ArrayList<Product> arrList = ProductRepository.getList();
        productView.printview(arrList);
    }




}
