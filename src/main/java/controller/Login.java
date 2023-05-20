package controller;

import bean.User;
import service.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class Login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");

        UserDAO userDAO = new UserDAO();
        try{
//          5. Kiểm tra username và password
            User u = userDAO.login(username, pass);
            //5.1.1 Username và password không tồn tại
            if (u == null){
               //5.1.1.1 Trả về màn hình đăng nhập
                request.getRequestDispatcher("login.jsp").forward(request, response);
            //5.1.2 Username và password tồn tại
            }else{
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("user", u);
                httpSession.setMaxInactiveInterval(600);
                //9. Hiển thị thông báo thành công và chuyển đến trang chủ
                request.setAttribute("loginsuccess", "Successful login.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
