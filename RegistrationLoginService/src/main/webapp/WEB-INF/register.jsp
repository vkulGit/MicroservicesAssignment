<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration and Login App</title>

<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
 </head>
 <body>
 <div class = "container">
  <div class = "row">
   <div class = "col-md-6 col-md-offset-3">
    
    <h1> Register User </h1>

	<form action="/registerUser" method="post">
		<div><h5><c:if test="${not empty error}">${error} </c:if></h5></div>
		<div><h5><c:if test="${not empty regSucc}">${regSucc} </c:if></h5></div>
		<div><h5><c:if test="${not empty regError}">${regError} </c:if></h5></div>
		<div class="form-group">
		 <label for ="username"  class="control-label"> UserName </label> : 
		<input type="text" name="userName" value="" required autofocus="autofocus"></div>
		
		<div class="form-group">
		<label for="password"  class="control-label">Password: </label><input type="password" name="password" value="" required autofocus="autofocus"></div>
		<div class="form-group">
		<label for="retypePassword"  class="control-label">Retype Password:</label> <input type="password" name="password1" value="" required autofocus="autofocus"></div>
		<div class="form-group">
		<label for="emailid"  class="control-label">EmailID :</label> <input type="text" name="emailId" required autofocus="autofocus"></div>
		<div class="form-group"> 
			<label for="securityquestion"  class="control-label">Security Question :</label>
			<select name="securityquestion">
				<option value="1">What is your favorite movie?</option>
				<option value="2">What was your first car?</option>
			</select>
		</div>
		<div class="form-group"> 
			<label for="securityans"  class="control-label">Answer :</label>
			<input type="text" name="securityans" value="" required autofocus="autofocus">
		</div>
		<div class="form-group"> 
			<input type="submit" value="Register"  class="btn btn-success">
		</div>
	</form>
</div>
</div>
</div>
</body>
</html>