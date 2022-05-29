<%@ include file="header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <html>
 <head>
 </head>
 <body>
 <div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
 <div class="panel panel-primary">
    <div class="panel-heading">Add Employee</div>
    <div class="panel-body">
    <div class="errorDiv" style="color: red;"><h5><c:if test="${not empty errorMsg}">${errorMsg}</c:if></h5></div>
    <div class="successDiv" style="color: green;"><h5><c:if test="${not empty successMsg}">${successMsg}</c:if></h5></div>
    <form action="/saveEmployee" method="post">
    <div class="form-group">
				 <label for ="empName"> Employee Name </label> : 
				 <input type="text" name="empName" value="" class = "form-control" required="required">
	</div>
	 <div class="form-group">
				 <label for ="experience"> Experience </label> : 
				 <input type="text" name="experience" value="" class = "form-control" required="required">
	</div>
	<div class="form-group">
				 <label for ="skills"> Skills </label> : 
				 <input type="text" name="skills" value="" class = "form-control" required="required">
	</div>
	<div class = "form-group">
				<input type="submit" value="Save"  class="form-control btn btn-primary" >
			</div>
    </form>
    </div>
  </div>
  </div>
  </div>
  </div>
  </body>  
  </html>