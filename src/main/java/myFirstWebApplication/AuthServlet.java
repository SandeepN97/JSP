package myFirstWebApplication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/autha")


public class AuthServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email=null;
		String gender=null;
		System.out.println(username);
		System.out.println(password);
		//SignupDta signupDta = new SignupDta(String, String, String, String );
		//if (signupDta.getUsername().equalsIgnoreCase(username) && signupDta.getPassword().equalsIgnoreCase(password)) {
		//	req.getRequestDispatcher("success.htm").forward(req, resp);
		//} else {
			//req.getRequestDispatcher("fail.htm").forward(req, resp);
		//}
	}
}
