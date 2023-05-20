package controller;

import bean.Order;
import bean.Room;
import bean.Time;
import service.OrderDAO;
import service.RoomDAO;
import service.TimeDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "Successful", value = "/successful")
public class Successful extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String checkIn = request.getParameter("checkIn");
        String checkOut = request.getParameter("checkOut");
        LocalDateTime startTime = LocalDateTime.parse(checkIn);
        LocalDateTime endTime = LocalDateTime.parse(checkOut);
        int idRoom = Integer.parseInt(request.getParameter("idRoom"));

        Time time = new Time(startTime, endTime, idRoom);

        int idTime = TimeDAO.getInstance().insert(time);

        Room room = RoomDAO.getInstance().getRoomById(idRoom);
        int total = room.getPrice() * (endTime.getHour() - startTime.getHour());

        Order order = new Order();
        order.setTime_id(idTime);
        order.setTotal(total);
        order.setRoom_id(idRoom);
        order.setUser_id(1);

        OrderDAO.getInstance().insert(order);
//      14.Hệ thống hiển thị trang successful.
        request.getRequestDispatcher("successful.jsp").forward(request, response);


    }
}
