<%@ include file="header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
 <div class="panel panel-primary">
    <div class="panel-heading">Employees List</div>
     <div class="panel-body">
      <div class="errorDiv" style="color: red;"><h5><c:if test="${not empty errorMsg}">${errorMsg}</c:if></h5></div>
    <div class="successDiv" style="color: green;"><h5><c:if test="${not empty successMsg}">${successMsg}</c:if></h5></div>
     	<table id="deleteEmp" class="table table-striped">
     		<thead>
     		<tr>
     			<th>Employee Name</th>
     			<th>Skills</th>
     			<th>Experience</th>
     			<th>Action</th>
     		</tr>
     		</thead>
     		<tbody>
     			  <c:forEach items="${empLst}" var="emp">
     			  	<tr>
     			  	<td>${emp.empName }</td>
     			  	<td>${emp.skills }</td>
     			  	<td>${emp.experience }</td>
     			  	<td><a href="/deleteEmp/${emp.empId }" >Delete</a></td>
     			  	<td style="display:none;">${emp.empId }</td>
     			  	</tr>
     			  </c:forEach>
     		</tbody>
     	</table>
     </div>
    </div>
    </div>
    </div>
    </div>
</body>
</html>

<script type="text/javascript">
	/* function deleteUser(empId){
		alert(empId);
		$.ajax({
		       type : "POST",
		       contentType : "application/json",
		       url : "/deleteEmp",
		       data : JSON.stringify(empId),
		       dataType : 'json',
		       cache : false,
		       timeout : 600000,
		       success : function(data) {
		        alert(data);
		       },
		       error : function(e) {
		        alert(e);
		       }
		      });
	} */
</script>