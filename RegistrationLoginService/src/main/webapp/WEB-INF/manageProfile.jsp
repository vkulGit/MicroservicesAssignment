<%@ include file="header.jsp"%>

<html>
	<head>
	<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
	</head>
	
	<body>
	<div class = "container">
  <div class = "row">
   <div class = "col-md-6 col-md-offset-3">

     <div class="panel panel-primary">
    <div class="panel-heading">Update User</div>
    <div class="panel-body">
    <div style="color:red;"><h5><c:if test="${not empty error}">${error} </c:if></h5></div>
		<div style="color:green;"> <h5><c:if test="${not empty regSucc}">${regSucc} </c:if></h5></div>
		<div style="color:red;"><h5><c:if test="${not empty regError}">${regError} </c:if></h5></div>
    	 <form action="/updateUser" method="post">
    	 	 <div class="form-group">
				 <label for ="userName"> UserName </label> : 
				 <input type="text" name="userName" value="${userName}" class = "form-control" required="required">
			</div>
			<div class="form-group">
				 <label for ="emailId"> Email ID </label> : 
				 <input type="text" name="emailId" value="${userDtls.emailid }" class = "form-control" disabled="disabled">
			</div>
			<div class = "form-group">
				<input type="submit" value="Update"  class="form-control btn btn-primary" >
			</div>
    	 </form>
    </div>
    </div>
    </div>
    </div>
    </div>
	</body>
</html>

<!-- <script type="text/javascript">
alert(JSON.stringify('${userDtls}'));
</script> -->