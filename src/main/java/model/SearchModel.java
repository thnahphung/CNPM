package model;

import service.EntityDAO;

import java.sql.SQLException;
import java.util.List;

public class SearchModel {
    private EntityDAO entityDAO;

    public SearchModel(String url, String user, String password) {
        // Khởi tạo lớp EntityDAO để xử lý việc truy xuất dữ liệu từ cơ sở dữ liệu
        this.entityDAO = new EntityDAO(url, user, password);
    }

    // Bước 3: Truy xuất cơ sở dữ liệu
    public List<Vendor> searchDB(String keyword) throws SQLException {
        return entityDAO.search(keyword);
    }
}
