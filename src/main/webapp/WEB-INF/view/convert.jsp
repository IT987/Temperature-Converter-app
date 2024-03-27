<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Temperature Converter</title>
<!-- Add Bootstrap CSS link -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<body style="background-color: black; color: white;">

	<div class="container mt-5" align="center">
		<h3 class="text-center mb-4">Temperature Converter</h3>
		<hr>
		<div class="col-md-6" align="left">
			<!-- Create a form using Spring form tag library and Bootstrap classes -->
			<form:form action="convert" method="POST" modelAttribute="convertForm"
				class="form-group">
				<!-- Input field for temperature with Bootstrap styling -->
				<label for="temperature">Temperature:</label>
				<form:input path="temperature" class="form-control" />
				<br>
				<!-- Dropdown for selecting conversion type with Bootstrap styling -->
				<label for="tempUnit">Choose conversion:</label>
				<form:select path="tempUnit" class="form-control">
					<!-- Options for conversion types -->
					<form:option value="toFahrenheit">Celsius to Fahrenheit</form:option>
					<form:option value="toCelsius">Fahrenheit to Celsius</form:option>
				</form:select>
				<br>
				<!-- Submit button with Bootstrap styling -->
				<button type="submit" class="btn btn-primary btn-block mt-3">Convert</button>
			</form:form>
		</div>
	</div>
</body></body>

</html>