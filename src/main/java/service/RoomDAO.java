package service;

import bean.Room;
import db.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {
    private static RoomDAO instance;

    public static RoomDAO getInstance() {
        if (instance == null)
            instance = new RoomDAO();
        return instance;
    }


    //3.Hệ thống lấy dữ liệu phòng.
    public List<Room> getListRoom() {
        List<Room> list = new ArrayList<>();
        String sql = "select * from room";
        try {
            Connection connection = DBConnect.getInstance().get();
            PreparedStatement statement = connection.prepareStatement(sql);
            if (statement != null) {
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    Room r = new Room();
                    r.setId(rs.getInt(1));
                    r.setNumber_room(rs.getInt(2));
                    r.setType(rs.getString(3));
                    r.setDescription(rs.getString(4));
                    r.setPrice(rs.getInt(5));
                    r.setImage_src(rs.getString(6));
                    r.setVendor_id(rs.getInt(7));
                    r.setStatus(rs.getInt(8));
                    list.add(r);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public Room getRoomById(int idRoom) {
        Room res = null;
        String sql = "SELECT * FROM room WHERE id=?";
        try {
            Connection connection = DBConnect.getInstance().get();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idRoom);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                res = new Room();
                res.setId(rs.getInt(1));
                res.setNumber_room(rs.getInt(2));
                res.setType(rs.getString(3));
                res.setDescription(rs.getString(4));
                res.setPrice(rs.getInt(5));
                res.setImage_src(rs.getString(6));
                res.setVendor_id(rs.getInt(7));
                res.setStatus(rs.getInt(8));
                break;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(RoomDAO.getInstance().getRoomById(2));
    }

}
