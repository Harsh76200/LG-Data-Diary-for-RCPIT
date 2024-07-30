<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
    <%@ page import = "com.EntityClasses.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div class="form-container">
        <h2>View My Infromation</h2>
       
        <br>
        <%-- Display account details if available --%>
        <% Student student = (Student) request.getAttribute("studentkey2");
           if (student != null)
           { 
        %>
   <table class="table-fill">
	<thead>
	<tr>
		<th class="text-left">PRN</th>
		<th class="text-left">Name</th>
		<th class="text-left">Branch</th>
		<th class="text-left">Year</th>
		<th class="text-left">Division</th>
		<th class="text-left">Addmission Year</th>
		<th class="text-left">Student LG</th>
		<th class="text-left">Age</th>
		<th class="text-left">Mobile</th>
		<th class="text-left">CGPA</th>
		<th class="text-left">DOB</th>
		<th class="text-left">Gender</th>
		<th class="text-left">Current Address</th>
		<th class="text-left">Email</th>
		<th class="text-left">Hostel</th>
		<th class="text-left">Aadhar</th>
		<th class="text-left">Religion</th>
		<th class="text-left">Parent Mob.</th>
	</tr>
	</thead>
	<tbody class="table-hover">

    <tr>
		<td class="text-left"><%=student.getPRN() %></td>
		<td class="text-left"><%=student.getStuName() %></td>
		<td class="text-left"><%=student.getStuBranch() %></td>
		<td class="text-left"><%=student.getStuYear() %></td>
		<td class="text-left"><%=student.getStuDiv() %></td>
	    <td class="text-left"><%=student.getStuAddmissionYear() %></td>
		<td class="text-left"><%=student.getStuLg() %></td>
		<td class="text-left"><%=student.getStuAge() %></td>
		<td class="text-left"><%=student.getStuMob() %></td>
		<td class="text-left"><%=student.getStuCgpa() %></td>
		<td class="text-left"><%=student.getStuDob() %></td>
		<td class="text-left"><%=student.getStuGender() %></td>
		<td class="text-left"><%=student.getStuCurrAddress() %></td>
		<td class="text-left"><%=student.getStuEmail() %></td>
		<td class="text-left"><%=student.getStuHostel() %></td>
		<td class="text-left"><%=student.getStuAadhar() %></td>
		<td class="text-left"><%=student.getStuReligion() %></td>
		<td class="text-left"><%=student.getStuParentMob() %></td>
	</tr>
    
	</tbody>
	<%
           }
	%>
</table>
</body>
</html>