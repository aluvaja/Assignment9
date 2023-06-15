<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Assignment 9</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
	<div class="container p-5">
		<div class=" p-5">
			<h1>Spring-Boot Application for Summation & Multiplication</h1>
		</div>
		
		<form class="mt-5 m-5" method="post">
			<div class="row mb-3">
				<label for="num1" class="col-sm-2 col-form-label">NUMBER 1</label>
				<div class="col-sm-10">
					<input name="num1" type="text" class="form-control border-5"
						id="num1">
				</div>
			</div>
			<div class="row mb-3">
				<label for="num2" class="col-sm-2 col-form-label">NUMBER 2</label>
				<div class="col-sm-10">
					<input name="num2" type="text" class="form-control border-5"
						id="num2">
				</div>
			</div>

			<div class="container ">
				<button formaction="sum" type="submit" class="btn btn-success m-5">Add
					+</button>

				<button formaction="multiply" type="submit" class="btn btn-success m-5">Multiply
					x</button>
			</div>
		</form>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>
</html>

