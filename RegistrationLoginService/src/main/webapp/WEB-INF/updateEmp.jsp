<%@ include file="header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <html>
 <head>
 </head>
 <body>
 <div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
 <div class="panel panel-primary">
    <div class="panel-heading">Update Employee</div>
    <div class="panel-body">
    <div class="errorDiv" style="color: red;"><h5><c:if test="${not empty errorMsg}">${errorMsg}</c:if></h5></div>
    <div class="successDiv" style="color: green;"><h5><c:if test="${not empty successMsg}">${successMsg}</c:if></h5></div>
    <form action="/updateEmp/${id }" method="post">
    <div class="form-group">
				 <label for ="empName"> Employee Name </label> : 
				 <input type="text" name="empName" value="${employee. empName}" class = "form-control" required="required">
	</div>
	 <div class="form-group">
				 <label for ="experience"> Experience </label> : 
				 <input type="text" name="experience" value="${employee. experience}" class = "form-control" required="required">
	</div>
	<div class="form-group">
				 <label for ="skills"> Skills </label> : 
				 <input type="text" name="skills" value="${employee. skills}" class = "form-control" required="required">
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