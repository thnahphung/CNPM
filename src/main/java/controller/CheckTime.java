package controller;

import bean.Room;
import bean.Time;
import service.RoomDAO;
import service.TimeDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "CheckTime", value = "/checkTime")
public class CheckTime extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String checkIn = request.getParameter("checkIn");
        String checkOut = request.getParameter("checkOut");
        LocalDateTime startTime = LocalDateTime.parse(checkIn);
        LocalDateTime endTime = LocalDateTime.parse(checkOut);
        int idRoom = Integer.parseInt(request.getParameter("idRoom"));

        Time time = new Time(startTime, endTime, idRoom);


        boolean isFree = TimeDAO.getInstance().checkTime(time);
        response.getWriter().println(isFree);
        if (isFree) {
            Room room = RoomDAO.getInstance().getRoomById(idRoom);
            int total = room.getPrice() * (endTime.getHour() - startTime.getHour());

            response.getWriter().println(total);
        }
    }

}
