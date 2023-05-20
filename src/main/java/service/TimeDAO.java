package service;

import bean.Time;
import db.DBConnect;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDAO {
    private static TimeDAO instance;

    public static TimeDAO getInstance() {
        if (instance == null)
            instance = new TimeDAO();
        return instance;
    }


    //    9. Hệ thống kiểm tra thời gian người dùng nhập vào xem có ai đặt chưa.
    public boolean checkTime(Time time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedStartTime = time.getStartTime().format(formatter);
        String formattedEndTime = time.getEndTime().format(formatter);

        String sql = "SELECT * FROM Time\n" +
                "WHERE (? BETWEEN start_time AND end_time OR\n" +
                "      ? BETWEEN start_time AND end_time OR\n" +
                "      start_time BETWEEN ? AND ?OR\n" +
                "      end_time BETWEEN ? AND ?\n" +
                "      AND (start_time != ? OR end_time != ?)) AND room_id =?;\n";
        try {
            Connection connection = DBConnect.getInstance().get();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, formattedStartTime);
            statement.setString(2, formattedEndTime);
            statement.setString(3, formattedStartTime);
            statement.setString(4, formattedEndTime);
            statement.setString(5, formattedStartTime);
            statement.setString(6, formattedEndTime);
            statement.setString(7, formattedStartTime);
            statement.setString(8, formattedEndTime);
            statement.setInt(9, time.getRoom_id());

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    public int insert(Time time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedStartTime = time.getStartTime().format(formatter);
        String formattedEndTime = time.getEndTime().format(formatter);
        int generatedId = -1; // giá trị mặc định
        try {
            Connection connection = DBConnect.getInstance().get();
            String sql = "INSERT INTO time (start_time,end_time,room_id) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, formattedStartTime);
            statement.setString(2, formattedEndTime);
            statement.setInt(3, time.getRoom_id());
            statement.executeUpdate();

            // Lấy kết quả từ PreparedStatement
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return generatedId;
    }


    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.parse("2023-04-29T18:30:00");
        LocalDateTime end = LocalDateTime.parse("2023-04-29T20:30:00");

        Time time = new Time(start, end, 2);

//        System.out.println(TimeDAO.getInstance().checkTime(time));

        System.out.println(getInstance().insert(time));

    }


}
