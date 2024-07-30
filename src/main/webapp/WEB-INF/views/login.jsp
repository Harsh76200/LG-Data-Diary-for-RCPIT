<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<!-- Basic Page Info -->
	<meta charset="utf-8">
	<title>RCPIT Shirpur</title>

	<!-- Site favicon -->
	<link rel="apple-touch-icon" sizes="180x180" href="./resources/vendors/images/rcpit.png">
	<link rel="icon" type="image/png" sizes="32x32" href="./resources/vendors/images/rcpit.png">
	<link rel="icon" type="image/png" sizes="16x16" href="./resources/vendors/images/rcpit.png">

	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- Google Font -->
	<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="./resources/vendors/styles/core.css">
	<link rel="stylesheet" type="text/css" href="./resources/vendors/styles/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="./resources/vendors/styles/style.css">

	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-119386393-1"></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag(){dataLayer.push(arguments);}
		gtag('js', new Date());

		gtag('config', 'UA-119386393-1');
	</script>
</head>
<body class="login-page">

	<div class="login-wrap d-flex align-items-center flex-wrap justify-content-center">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-md-6 col-lg-7">
					<img src="./resources/vendors/images/login-page-img.png" alt="">
				</div>
				<div class="col-md-6 col-lg-5">
					<div class="login-box bg-white box-shadow border-radius-10">
						<div class="login-title">
							<h2 class="text-center text-primary">Login To LG Data Dairy</h2>
						</div>
						
						
						<form action="adminLoginCheck" method="POST">
							<div class="select-role">
								<div class="btn-group btn-group-toggle" data-toggle="buttons">
									<label class="btn active" style="margin-bottom: 10px ;">
										<input type="radio" name="admin" value="admin" id="admin">
										<div class="icon"><img src="./resources/vendors/images/briefcase.svg" class="svg" alt=""></div>
										<span>I'm a</span>
										HOD
									</label>
									<label class="btn" style="margin-bottom: 10px ;" >
										<input type="radio" name="lg" value="lg" id="admin">
										<div class="icon"><img src="./resources/vendors/images/briefcase.svg" class="svg" alt=""></div>
										<span>I'm a</span>
										LG
									</label>
									<br>

									<label class="btn" style="margin-bottom: 10px ; margin-right: 85px; margin-left: 85px;">
										<input type="radio" name="student" value="student" id="user">
										<div class="icon"><img src="./resources/vendors/images/person.svg" class="svg" alt=""></div>
										<span>I'm a</span>
										Student
									</label>
									
									
								</div>
				
							</div>
							<div class="input-group custom">
								<input type="text" class="form-control form-control-lg" name="email" placeholder="Username or Email">
								<div class="input-group-append custom">
									<span class="input-group-text"><i class="icon-copy dw dw-user1"></i></span>
								</div>
							</div>
							<div class="input-group custom">
								<input type="password" class="form-control form-control-lg" name="password" placeholder="**********">
								<div class="input-group-append custom">
									<span class="input-group-text"><i class="dw dw-padlock1"></i></span>
								</div>
							</div>
							<div class="row pb-30">
								<div class="col-6">
									<div class="custom-control custom-checkbox">
										<input type="checkbox" class="custom-control-input" id="customCheck1">
										<label class="custom-control-label" for="customCheck1">Remember</label>
									</div>
								</div>
							
							</div>
							<div class="row">
								<div class="col-sm-12">
									<div class="input-group mb-0">
									
									  <input class="btn btn-primary btn-lg btn-block" type="submit" value="Sign In">
										
									</div>
									
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- js -->
	<script src="./resources/vendors/scripts/core.js"></script>
	<script src="./resources/vendors/scripts/script.min.js"></script>
	<script src="./resources/vendors/scripts/process.js"></script>
	<script src="./resources/vendors/scripts/layout-settings.js"></script>
</body>
</html>