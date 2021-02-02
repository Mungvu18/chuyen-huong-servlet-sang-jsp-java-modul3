import Modals.User;

import java.io.IOException;
import javax.servlet.annotation.*;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "Truyen-du-lieu-Servlet-jps",urlPatterns = {"/truyen"})
public class TruyendulieuServletjps extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String birthday = request.getParameter("birthday");
        String password = request.getParameter("password");
        String confirmation_pwd = request.getParameter("confirmation_pwd");
        String address = request.getParameter("address");
        User user = new User(name,email,birthday,password,confirmation_pwd,address);
        System.out.println(user);

        response.sendRedirect("welcome?name="+name+"email"+email+"address"+address);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("index.jsp");
      RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
      dispatcher.forward(request,response);
    }
}
