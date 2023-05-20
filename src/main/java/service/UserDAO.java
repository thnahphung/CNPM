package service;

import bean.User;
import db.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;


    public static  UserDAO instance;

    public static UserDAO getInstance(){
        if(instance == null){
            instance = new UserDAO();
        }
        return instance;
    }
    //Chức năng đng nhập: 5.1 User name và password có tồn tại không
    public User login(String uname, String pass) throws SQLException{
        String query = "SELECT * FROM USER WHERE user_name = ? and password = ?";
        try{
            connection = DBConnect.getInstance().get();//7. Kết nối dữ liệu
            ps = connection.prepareStatement(query);
            //8. Kiểm tra tên đăng nhập và mật khẩu
            ps.setString(1, uname);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()){
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3)
                        , rs.getString(4), rs.getString(5), rs.getString(6)
                        , rs.getInt(7));
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

//  Chức năng đăng ký: 5.1 Email đã tồn tại chưa
    public User checkUser(String email){
        String query = "SELECT * FROM USER WHERE email = ?";
        try{
            connection = DBConnect.getInstance().get();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()){
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3)
                        ,rs.getString(4), rs.getString(5), rs.getString(6)
                        ,rs.getInt(7) );
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    public void register(String full_name, String email, String phone, String user_name, String pass) {
        String query = "INSERT INTO USER (name, email, phone, user_name, password, variety) " +
                "VALUES(?, ?, ?, ?, ?, 1)";
        try{
            connection = DBConnect.getInstance().get();
            ps = connection.prepareStatement(query);
            ps.setString(1, full_name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, user_name);
            ps.setString(5, pass);
            ps.executeUpdate();// Chức năng đăng ký: 5.2 Lưu dữ liệu đã đăng ký
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        System.out.println(UserDAO.getInstance().checkUser("nguyenthihong@gmail.com"));
    }

}
