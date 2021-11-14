<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./Base.jsp"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="ISO-8859-1">
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-12">
<h1 class="text-center mb-3">Welcome To Product</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Product Description</th>
      <th scope="col">Price</th>
        <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${product }" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td class="font-weight-bold">&#8377;${p.price }</td>
      <td>
      <a href="delete-handler/${p.id }"><i class="fas fa-trash text-danger" style="font-size:30px"></i></a>
      <a href="update-handler/${p.id }"><i class="fas fa-pen-nib text-primary" style="font-size:30px"></i></a>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="container text-center">
<a href="addProduct" class="btn btn-outline-success">Add Product</a>
</div>
</div>
</div>
</div>
</body>
</html>