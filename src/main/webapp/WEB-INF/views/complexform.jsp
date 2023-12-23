<!doctype html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="background: gray;">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex form</h3>
						
						<div class="alert alert-danger" role="alert">
						
						<form:errors path="student.*"/>
						
						</div>
						
						<form action="handleform" method="post">
							<div class="form-group">
								<label for="exampleInputName">Your Name</label> <input
									type="text" name="name" class="form-control" id="inputname"
									placeholder="Enter Name"> <small id="emailhelp"
									class="form-text text-muted">We'll never share your
									name with anyone else</small>
							</div>
							<div class="form-group">
								<label for="inputid">your id</label> <input name="id"
									type="text" class="form-control" placeholder="enter id">
							</div>
							<div class="form-group">
								<label for="inputDate">your DOB</label> <input name="date"
									type="date" class="form-control" placeholder="dd/mm/yy">
							</div>
							<div class="form-group">
								<label for="selectcourse">Select Course</label> <select
									name="Courses" class="form-control" id="selectcoursees"
									multiple="multiple">
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>C#</option>
									<option>Servlet</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="radio1" value="male"> <label
										class="form-check-label" for="inlineradio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="radio2" value="male"> <label
										class="form-check-label" for="inlineradio2">Female</label>
								</div>
							</div>
							<div class="form-group">
								<label for="selectcourse">Select Type</label> <select
									name="StudentType" class="form-control" id="selecttype">
									<option>Old Student</option>
									<option>New Student</option>

								</select> <br>

								<div class="card">
									<div class="card-body">
										<p>Your Address</p>

										<div class="form-group">
											<input name="address.street" type="text" class="form-control"
												placeholder="Enter street" />

										</div>
										<div class="form-group">
											<input name="address.city" type="text" class="form-control"
												placeholder="Enter city" />

										</div>
									</div>
								</div>


							</div>
							<div class="container text-center">
								<button type="submit" class="btn btn-success">Submit</button>
							</div>

						</form>
					</div>
				</div>
			</div>

		</div>

	</div>







	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>