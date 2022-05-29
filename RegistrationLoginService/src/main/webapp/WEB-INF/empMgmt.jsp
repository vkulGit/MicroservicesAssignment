<%@ include file="header.jsp"%>

<html>
<head>

</head>
<body>
	<div align="center">
		<h1>Employee Management System</h1>
	</div>
	
	<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
  <div class="panel panel-primary">
    <div class="panel-heading">Operations List</div>
  		<div class="panel-body">
  			<!-- <div class="form-group">
 				<input type="button" name="addEmployee" value="Add Employee" />
  			  </div> -->
  			  <ul>
  			  	<li><a href="/addEmployee">Add Employee</a></li>
  			  	<li><a href="/viewEmployee">View Employee</a></li>
  			  	<li><a href="/updateEmployee">Update Employee</a></li>
  			  	<li><a href="/deleteEmployee">Delete Employee</a></li>
  			  </ul>
  		</div>
    </div>
    </div>
    </div>
</div>
</body>
</html>