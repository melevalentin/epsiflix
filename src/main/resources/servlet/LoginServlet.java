package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "root//toor";
        String formUsername = request.getParameter("username");
        String formPassword = request.getParameter("password");
        String formLogin = formUsername+"//"+formPassword;

        if (user.equals(formLogin)){
            request.setAttribute("user", formLogin);
            request.getRequestDispatcher("/home.jsp").forward(request, response);
        }
        else{
            request.setAttribute("error", "Login failed. Please retry !");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        System.out.println("PASSE PAR LE doPost gg");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("PASSE PAR LE doGet");
    }
}
