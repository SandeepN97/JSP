<!DOCTYPE html>
<%@page import="myFirstWebApplication.SignupDta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <header style="height: 30px;background-color:yellow; ">
   </header>
   
   <section class="container">
   	<h1>Search Page!!</h1>
   	 <img style="height: 160px;" src="https://s40424.pcdn.co/in/wp-content/uploads/2022/03/What-is-project-management-Meaning-and-Definition-of-Project-Management-1.jpg">
   	  <img style="height: 160px;" src="https://s40424.pcdn.co/in/wp-content/uploads/2022/03/What-is-project-management-Meaning-and-Definition-of-Project-Management-1.jpg">
   	   <img style="height: 160px;" src="https://s40424.pcdn.co/in/wp-content/uploads/2022/03/What-is-project-management-Meaning-and-Definition-of-Project-Management-1.jpg">
   	 <br/><br/>
   	 
   	 <form action="searchData" method="get">
   	 	<label>Search Data</label>
   		 <input type="text" name="searchText" class="form-control" style="width: 50%;display: inline;margin-right: 10px;">
   	 	 <button type="submit" class="btn btn-primary" style="margin-top: -4px;">GO</button>
   	 </form>
   	 <br/>	
   	  <span style="color:red;font-size: 18px;font-weight: bold;">${message}</span>
   	 <br/>	
   	 
   	 
   	 <%
   //req.setAttribute("ssita", signuplist);
 	List<SignupDta> signuplist=(List<SignupDta> )request.getAttribute("key");
 	if(signuplist==null){
 		signuplist =new ArrayList<>();
 	}
 	
 	if(signuplist.size()>0) {
   	 
   	 %>
   	 
   	 
   	  <table class="table table-bordered">
    <thead>
      <tr style="background-color: maroon;color:white;">
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
        <th>Gender</th>
         <th>Action</th>
      </tr>
    </thead>
    <tbody>
	
	
	<%
	
	for(SignupDta signupDTO : signuplist){ 	
	%>    
      <tr>
        <td><%=signupDTO.getUsername()%></td>
        <td><%=signupDTO.getPassword()%></td>
        <td><%=signupDTO.getEmail()%></td>
         <td><%=signupDTO.getGender()%></td>
         
          <td>
           <button type="button" class="btn btn-warning">DELETE</button>
          </td>
      </tr>
      <%
      } 
      %>
     
    </tbody>
  </table>
  <% } %>
   </section>
 
</body>
</html>