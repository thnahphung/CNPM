package controller;

import bean.User;
import service.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String full_name = request.getParameter("full_name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String user_name = request.getParameter("username");
        String pass = request.getParameter("pass");

        UserDAO userDAO = new UserDAO();
        //5. Kiểm tra email
        User u = userDAO.checkUser(email);
        //5.1.2 Email chưa tồn tại
        if(u == null){
            userDAO.register(full_name, email, phone, user_name, pass);
            //6. Chuyển đến trang đăng nhập
            response.sendRedirect("login.jsp");
            //5.1.1 Email đã tồn tại
        }else {
            //5.1.1.1 Trả về màn hình đăng ký.
            response.sendRedirect("register.jsp");

        }
    }
}
