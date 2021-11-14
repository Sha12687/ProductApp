<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="./Base.jsp"%>

</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill The Product Detail</h1>
				<form action="handle-product" method="post">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="Enter The Product name">
					</div>
					<div class="form-group">
						<label for="description" class="form-label">Description</label>
						 <textarea class="form-control" name="description" placeholder="Enter the description"
						 id="description" rows="4"></textarea>
					</div>
					<div class="form-group">
						<label for="price" class="form-label">Price</label> 
						<input
							type="text" name="price" id="price"
							placeholder="Etner the Price" class="form-control">
					</div>
					<div class="container text-center mt-5">
						<a href="${pageContext.request.contextPath }/home"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
			</div>
			</form>
		</div>
	</div>
</body>
</html>