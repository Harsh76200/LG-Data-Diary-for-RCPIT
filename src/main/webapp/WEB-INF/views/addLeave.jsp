<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Leave Application Form</title>
</head>
<body>

<h2>Leave Application Form</h2>
<form action="afterLeaveSubmit" method="post">
    <!-- PRN (Assuming it's a numeric value) -->
    <label for="PRN">PRN:</label>
    <input type="number" id="PRN" name="PRN" required><br>

    <!-- Name -->
    <label for="Name">Name:</label>
    <input type="text" id="Name" name="Name" required><br>

    <!-- Year (Dropdown) -->
    <label for="Year">Year:</label>
    <select id="Year" name="Year" required>
        <option value="FY">FY</option>
        <option value="SY">SY</option>
        <option value="TY">TY</option>
        <option value="LastYear">Last Year</option>
    </select><br>

    <!-- Branch -->
    <label for="Branch">Branch:</label>
    <input type="text" id="Branch" name="Branch" required><br>

    <!-- Leave From (Calendar Input) -->
    <label for="leaveFrom">Leave From:</label>
    <input type="date" id="leaveFrom" name="leaveFrom" required><br>

    <!-- Leave To (Calendar Input) -->
    <label for="leaveTo">Leave To:</label>
    <input type="date" id="leaveTo" name="leaveTo" required><br>

    <!-- Mobile Number -->
    <label for="Mob">Mobile Number:</label>
    <input type="tel" id="Mob" name="Mob" required><br>

    <!-- Leave Subject -->
    <label for="leaveSubject">Leave Subject:</label>
    <input type="text" id="leaveSubject" name="leaveSubject" required><br>

    <!-- Leave Description -->
    <label for="leaveDescription">Leave Description:</label>
    <textarea id="leaveDescription" name="leaveDiscription" rows="4" cols="50" required></textarea><br>

    <!-- Student Signature -->
    <label for="studentSignature">Student Signature:</label>
    <input type="text" id="studentSignature" name="studentSignature" required><br>
    
     <label for="Year">Leave Status:</label>
    <select id="Year" name="leaveStatus" required>
        <option value="Pendinp">Pending</option>
    </select><br>

    <!-- Submit Button -->
    <input type="submit" value="Submit">
</form>

</body>
</html>
