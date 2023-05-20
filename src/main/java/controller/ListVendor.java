package controller;

import db.JDBiConnector;
import model.Vendor;
import service.VendorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListVendor", value = "/vendor")
public class ListVendor extends HttpServlet {
    private VendorService vendorService = new VendorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String searchName = request.getParameter("searchName");

        if (searchName != null && !searchName.isEmpty()) {
            try {
                // Xu ly du lieu input
                searchName = searchName.replaceAll("[^\\p{L}\\p{Z}]", ""); // Xoa cac ky tu dac biet, chi giu lai ky tu khoang trang

                // Tao cau query
                String sql = "SELECT * FROM vendor WHERE name LIKE ?";

                // Thuc hien truy van
                String searchVendor = searchName;
                List<Vendor> list = JDBiConnector.me().withHandle(handle -> {
                    return handle.createQuery(sql)
                            .bind(0, "%" + searchVendor + "%")
                            .mapToBean(Vendor.class)
                            .list();
                });

                if (!list.isEmpty()) {
                    // Neu tim thay nha cung cap, tra ve danh sach nha cung cap tren trang vendor.jsp
                    request.setAttribute("list", list);
                    request.getRequestDispatcher("vendor.jsp").forward(request, response);
                } else {
                    // Neu khong tim thay nha cung cap, thong bao cho nguoi dung
                    request.setAttribute("message", "Không tìm thấy nhà cung cấp");
                    request.getRequestDispatcher("vendor.jsp").forward(request, response);
                }
            } catch (Exception e) {
                // Xu ly ngoai le, thong bao cho nguoi dung
                request.setAttribute("message", "Có lỗi xảy ra trong quá trình tìm kiếm nhà cung cấp");
                request.getRequestDispatcher("vendor.jsp").forward(request, response);
            }
        } else {
            // Neu khong co tu khoa tim kiem, hien thi toan bo nha cung cap
            List<Vendor> list = VendorService.getListVendor();
            request.setAttribute("list", list);
            request.getRequestDispatcher("vendor.jsp").forward(request, response);
        }
    }



//        String searchName = request.getParameter("searchName");
//
//        if (searchName != null && !searchName.isEmpty()) {
//            searchProducts(request, response, searchName);
//        } else {
//            List<Vendor> list = vendorService.getListVendor();
//            request.setAttribute("list", list);
//            request.getRequestDispatcher("vendor.jsp").forward(request, response);
//        }




//        List<Vendor> list= VendorService.getListVendor();
//        request.setAttribute("list",list);
//        request.getRequestDispatcher("vendor.jsp").forward(request,response);

//        String searchName = request.getParameter("searchName");
//        if (searchName != null && !searchName.isEmpty()) {
//            try {
//                // Xu ly du lieu input
//                searchName = searchName.replaceAll("[^\\p{L}\\p{Z}]", ""); // Xoa cac ky tu dac biet, chi giu lai ky tu khoang trang
//
//                // Tao cau query
//                String sql = "SELECT * FROM products WHERE name LIKE ?";
//
//                // Thuc hien truy van
//                String searchProduct = searchName;
//                List<Vendor> list1= JDBiConnector.me().withHandle(handle -> {
//                    return handle.createQuery(sql)
//                            .bind(0, "%" + searchProduct + "%")
//                            .mapToBean(Vendor.class)
//                            .list();
//                });
//
//                if (!list.isEmpty()) {
//                    // Neu tim thay san pham, tra ve danh sach san pham tren trang product.jsp
//                    request.setAttribute("list", list);
//                    request.getRequestDispatcher("product.jsp").forward(request, response);
//                } else {
//                    // Neu khong tim thay san pham, thong bao cho nguoi dung
//                    request.setAttribute("message", "Không tìm thấy sản phẩm");
//                    request.getRequestDispatcher("product.jsp").forward(request, response);
//                }
//            } catch (Exception e) {
//                // Xu ly ngoai le, thong bao cho nguoi dung
//                request.setAttribute("message", "Có lỗi xảy ra trong quá trình tìm kiếm sản phẩm");
//                request.getRequestDispatcher("product.jsp").forward(request, response);
//            }
//        } else {
//            // Neu khong co tu khoa tim kiem, hien thi toan bo san pham
//            doGet(request, response);
//        }

   // }

//    private void searchProducts(HttpServletRequest request, HttpServletResponse response, String searchName) throws ServletException, IOException {
//        try {
//            // Xu ly du lieu input
//            searchName = searchName.replaceAll("[^\\p{L}\\p{Z}]", ""); // Xoa cac ky tu dac biet, chi giu lai ky tu khoang trang
//
//            // Tao cau query
//            String sql = "SELECT * FROM products WHERE name LIKE ?";
//
//            // Thuc hien truy van
//            String searchProduct = searchName;
//            List<Vendor> list = JDBiConnector.me().withHandle(handle -> {
//                return handle.createQuery(sql)
//                        .bind(0, "%" + searchProduct + "%")
//                        .mapToBean(Vendor.class)
//                        .list();
//            });
//
//            if (!list.isEmpty()) {
//                // Neu tim thay san pham, tra ve danh sach san pham tren trang product.jsp
//                request.setAttribute("list", list);
//                request.getRequestDispatcher("product.jsp").forward(request, response);
//            } else {
//                // Neu khong tim thay san pham, thong bao cho nguoi dung
//                request.setAttribute("message", "Không tìm thấy sản phẩm");
//                request.getRequestDispatcher("product.jsp").forward(request, response);
//            }
//        } catch (Exception e) {
//            // Xu ly ngoai le, thong bao cho nguoi dung
//            request.setAttribute("message", "Có lỗi xảy ra trong quá trình tìm kiếm sản phẩm");
//            request.getRequestDispatcher("product.jsp").forward(request, response);
//        }
//    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
