package myFirstWebApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchData ")
public class SearchDataServelet extends HttpServlet {
	
    private List<SignupDta> signuplist = new ArrayList<SignupDta>();
    
    @Override
    public void init() {
    	SignupDta dta1 =   new SignupDta("sandeep1","test1","sny1@gmail.com","Male");
    	SignupDta dta2 =   new SignupDta("sandeep2","test2","sny2@gmail.com","Male");
    	SignupDta dta3 =   new SignupDta("sandeep3","test3","sny3@gmail.com","Male");
    	SignupDta dta4 =   new SignupDta("sandeep4","test4","sny4@gmail.com","Male");
    	SignupDta dta5 =   new SignupDta("sandeep5","test5","sny5@gmail.com","Male");
    	signuplist.add(dta1);
    	signuplist.add(dta2);
    	signuplist.add(dta3);
    	signuplist.add(dta4);
    	signuplist.add(dta5);
    	
    }
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String searchText = req.getParameter("searchText");
	List <SignupDta> searchReasultList = new ArrayList<SignupDta>();
	for(SignupDta singupDta : signuplist) {
		if(searchText.equals(singupDta.getGender())||searchText.equals(singupDta.getUsername()) || searchText.equals(singupDta.getPassword()) || searchText.equals(singupDta.getEmail())) {
			searchReasultList.add(singupDta);
		}
	}
	req.setAttribute("key",searchReasultList);
	req.getRequestDispatcher("search.jsp").forward(req,resp);
}
}
