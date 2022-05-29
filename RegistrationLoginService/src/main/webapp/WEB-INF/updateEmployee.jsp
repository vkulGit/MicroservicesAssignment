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
     	<table id="viewEmp" class="table table-striped">
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
     			  	<td><a href="/updateEmp/${emp.empId }" >Update</a></td>
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
	//alert(JSON.stringify('${empLst}'));
</script>