package service;

import bean.Order;
import db.DBConnect;

import java.sql.*;

public class OrderDAO {

    private static OrderDAO instance;

    public static OrderDAO getInstance() {
        if (instance == null)
            instance = new OrderDAO();
        return instance;
    }


    //13.Hệ thống lưu thông tin phòng.
    public int insert(Order order) {
        int generatedId = -1;
        try {
            Connection connection = DBConnect.getInstance().get();
            String sql = "INSERT INTO `order` (total,user_id,room_id,time_id) VALUES (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, order.getTotal());
            statement.setInt(2, order.getUser_id());
            statement.setInt(3, order.getRoom_id());
            statement.setInt(4, order.getTime_id());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return generatedId;
    }
}
