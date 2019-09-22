<%@page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="UpdateStudent">

<b>	
				<pre>	
                        			Update Student
                        							
                        							
                        							
                        RNO				<input type="text" name="rno" readonly="readonly" value="${studentInfo.getRno()} "/>
                        
                        Name				<input type="text" name="name" value="${studentInfo.getName()} "/>
                        
                        Branch				<input type="text" name="branch" value="${studentInfo.getBranch()} ">
                        
                        Sem				<input type="text" name="sem"  value="${studentInfo.getSem()} ">
                        
                        		
                        					<button type="submit" name="btnSignup"  ForeColor="Fuchsia">Update</button>
                        					
					</pre>	
					
				</b>


</form>


</body>
</html>