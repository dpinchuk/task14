package com.dpinchuk;

import com.dpinchuk.controllers.Controller;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
public class Main {

    static final String URL = "jdbc:mysql://127.0.0.1:3306";
    static final String DB = "auction_db";
    static final String USER = "dpinchuk";
    static final String PASS = "dmss111278";
    static Connection connection;
    static Controller controller;

    public static void main(String[] args) throws IOException, SQLException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        try {
            connection = DriverManager.getConnection(URL + "/" + DB, USER, PASS);
            controller = new Controller(connection);
            controller.selectItem();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database connection error...");
        }
    }

}