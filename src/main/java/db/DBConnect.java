package db;
import java.sql.*;


public class DBConnect {
    String url = "jdbc:mysql://localhost:3306/cnpm";
    String user = "root";
    String pass = "";
    Connection connect;

    static DBConnect install;
    //kết nối với MySQL
    private DBConnect()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBConnect getInstance() {
        if(install == null) install = new DBConnect();
        return install;
    }

    //tạo đối tượng statement
    public Statement getStatement() {
        if(connect == null) return null;
        try {
            return connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            return null;
        }
    }

    private void connect() throws SQLException, ClassNotFoundException {
        if (connect == null || connect.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);
        }
    }

    public Connection get() {
        try {
            connect();
            return connect;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Statement statement = DBConnect.getInstance().getStatement();
        if(statement != null)
            try {
                ResultSet rs = statement.executeQuery("select * from vendor");
                rs.last();
                System.out.println(rs.getRow());
                rs.beforeFirst();
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        else {
            System.out.println("no connection");
        }
    }
}
