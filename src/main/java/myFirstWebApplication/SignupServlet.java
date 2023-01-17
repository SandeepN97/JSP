package myFirstWebApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signupServlet")
public class SignupServlet extends HttpServlet {
	
	private List<SignupDta> signuplist=new ArrayList<SignupDta>();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		
		SignupDta signupDta = new SignupDta(username, password, email, gender);
		boolean addFlag = true;
		for(SignupDta dto : signuplist) {
			if(dto.getUsername().equals(username)) {}
			addFlag = false;
			break;
		}
		if(addFlag) {
			signuplist.add(signupDta);
			req.setAttribute("message", "Data has been added");
		}else {
			req.setAttribute("message", "Duplicate data exist!");
		}
		//System.out.println(signuplist);
		req.setAttribute("key", signuplist);
		
		req.getRequestDispatcher("slist.jsp").forward(req,resp);
	}
}
