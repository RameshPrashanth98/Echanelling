<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prescription</title>
<link rel="stylesheet" href="Images/Register.css">
<script src="prescription.js"></script>
</head>
<body>
	<div class="registerbox">
	<h1>Fill this form to make an order</h1><br>
	<form action="prescriptioncontroller" method="post" id="form" >
		<label>User name</label><br><input type ="text" name="uname" id="UN" required><br>
		<label>ID or Licene No</label><br><input type ="text" name="lid" id="ID" required><br>
		<label>Address</label><br><input type ="text" name="address" id="ADD" required><br>
		<label>Mobile No</label><br><input type ="text" name="mobile" id="MOB" required><br>
		<label>Special details</label><br><input type = "text" name="medicine" placeholder="No any specilal details you can keep this blank" id="DET" ><br>
		
		<h3>Note:-Please enter your correct user name otherwise we will not ship your order<br>You can add any special details about location in special details field</h3><br>
	

		
		
		
		<div class=btnr><input type="submit" value="Submit"></div>
		
	
	
	</form>
	</div>
</body>
</html>