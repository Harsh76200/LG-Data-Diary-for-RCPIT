<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
    <%@ page import = "com.EntityClasses.Leave" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div class="form-container">
        <h2>View Infromation</h2>
        <form action="afterViewLeave" method="post">
            <div class="form-group">
                <label for="accNo">Enter PRN: </label>
                <input type="text" class="form-control" name="PRN" placeholder="Enter LG ID" required>
            </div>
            <button type="submit" class="btn btn-primary" onclick="viewLeave">View</button>
        </form> 
        <br>
        <%-- Display account details if available --%>
        <% Leave leave = (Leave) request.getAttribute("studentkey");
           if (leave != null)
           
           { 
        %>
   <table class="table-fill">
	<thead>
	<tr>
		<th class="text-left">PRN</th>
		<th class="text-left">Name</th>
		<th class="text-left">Year</th>
		<th class="text-left">Branch</th>
		<th class="text-left">Leave From</th>
		<th class="text-left">Leave To</th>
		<th class="text-left">Leave Subject</th>
		<th class="text-left">Leave Description</th>
		<th class="text-left">Leave Status</th>
		<th class="text-left">Delete Leave</th>
		
	</tr>
	
	</thead>
	<tbody class="table-hover">

    <tr>
		<td class="text-left"><%=leave.getPRN() %></td>
		<td class="text-left"><%=leave.getName() %></td>
		<td class="text-left"><%=leave.getYear() %></td>
		<td class="text-left"><%=leave.getBranch() %></td>
		<td class="text-left"><%=leave.getLeaveFrom() %></td>
		<td class="text-left"><%=leave.getLeaveTo() %></td>
		<td class="text-left"><%=leave.getLeaveSubject() %></td>
		<td class="text-left"><%=leave.getLeaveDiscription() %></td>
		<td class="text-left"><%=leave.getLeaveStatus() %></td>
		<td><a href="deleteLeave/<%=leave.getPRN() %>">Delete</a></td>

	</tr>
    
	</tbody>
	<%
           }
	%>
</table>
</body>
</html>