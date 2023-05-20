package controller;

import bean.Room;
import service.RoomDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RoomDetail", value = "/roomDetail")
public class RoomDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idRoom = Integer.parseInt(request.getParameter("idRoom"));

        Room room = RoomDAO.getInstance().getRoomById(idRoom);
        request.setAttribute("room", room);

//        4. Hiển thị trang chi tiết của phòng
        request.getRequestDispatcher("room-details.jsp").forward(request, response);
    }
}
