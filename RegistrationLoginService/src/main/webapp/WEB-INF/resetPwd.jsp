<%@ include file="header.jsp"%>

<html>
<head>
</head>
<body>
<div class = "container">
  <div class = "row">
   <div class = "col-md-6 col-md-offset-3">

     <div class="panel panel-primary">
    <div class="panel-heading">Reset Password</div>
    <div class="panel-body">
    <div style="color:red;"><h5><c:if test="${not empty error}">${error} </c:if></h5></div>
		<div style="color:green;"> <h5><c:if test="${not empty succ}">${succ} </c:if></h5></div>
 			<form action="/resetPassword" method="post">
    	 	 <div class="form-group">
				 <label for ="oldPwd"> Old Password </label> : 
				 <input type="password" name="oldPwd" value="" class = "form-control" required="required">
			</div>
			 <div class="form-group">
				 <label for ="newPassword"> New Password </label> : 
				 <input type="password" name="newPwd" value="" class = "form-control" required="required">
			</div>
			<div class="form-group">
				 <label for ="retypePwd">Retype New Password </label> : 
				 <input type="password" name="retypeNewPwd" value="" class = "form-control" required="required">
			</div>
			<div class = "form-group">
				<input type="submit" value="Reset Password"  class="form-control btn btn-primary" >
			</div>
			</form>
    </div>
    </div>
    </div>
    </div>
    </div>
</body>
</html>