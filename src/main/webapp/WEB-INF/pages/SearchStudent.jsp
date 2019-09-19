<%@page import="java.io.PrintWriter"%>
<%@page import="com.anuj.entities.Student"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="searchstudent">

<b>	
				<pre>	
                        			Search Student
                        			
                   Enter Id				<input type="text" name="id" placeholder="Enter Id"/>
                   
                   <button type="submit" name="btnSignup"  ForeColor="Fuchsia">Search</button>
     </form>      
                              							
            <hr>          							
                       							 
                        Id				:${studentInfo.getRno()}
                        
                        Name				:${studentInfo.getName()}
                        
                        Address				:${studentInfo.getBranch()}
                        
                        Mobile				:${studentInfo.getSem()}
                         
                        		
                        					   <hr>             					
					</pre>	
					
				</b>





</body>
</html>