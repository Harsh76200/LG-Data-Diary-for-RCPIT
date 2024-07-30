<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
<%@ page import = "com.EntityClasses.LG" %>
<%@ page import = "com.EntityClasses.Student" %>
<%@ page import = "com.EntityClasses.Notice" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<!-- Basic Page Info -->
	<meta charset="utf-8">
	<title>DeskApp - Bootstrap Admin Dashboard HTML Template</title>

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
	<link rel="stylesheet" type="text/css" href="./resources/src/plugins/datatables/css/dataTables.bootstrap4.min.css">
	<link rel="stylesheet" type="text/css" href="./resources/src/plugins/datatables/css/responsive.bootstrap4.min.css">
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
<body>
	<div class="pre-loader">
		<div class="pre-loader-box">
			<div class="loader-logo"><img src="./resources/vendors/images/rcpit.png" height="200px" width="200px"></div>
			<div class='loader-progress' id="progress_div">
				<div class='bar' id='bar1'></div>
			</div>
			<div class='percent' id='percent1'>0%</div>
			<div class="loading-text">
				Loading...
			</div>
		</div>
	</div>
	
	
	<div class="header">
		<div class="header-left">
			<div class="menu-icon dw dw-menu"></div>
			<div class="search-toggle-icon dw dw-search2" data-toggle="header_search"></div>
			<div class="header-search">
				<form>
					<div class="form-group mb-0">
						<i class="dw dw-search2 search-icon"></i>
						<input type="text" class="form-control search-input" placeholder="Search Here">
						<div class="dropdown">
							<a class="dropdown-toggle no-arrow" href="#" role="button" data-toggle="dropdown">
								<i class="ion-arrow-down-c"></i>
							</a>
							<div class="dropdown-menu dropdown-menu-right">
								<div class="form-group row">
									<label class="col-sm-12 col-md-2 col-form-label">From</label>
									<div class="col-sm-12 col-md-10">
										<input class="form-control form-control-sm form-control-line" type="text">
									</div>
								</div>
								<div class="form-group row">
									<label class="col-sm-12 col-md-2 col-form-label">To</label>
									<div class="col-sm-12 col-md-10">
										<input class="form-control form-control-sm form-control-line" type="text">
									</div>
								</div>
								<div class="form-group row">
									<label class="col-sm-12 col-md-2 col-form-label">Subject</label>
									<div class="col-sm-12 col-md-10">
										<input class="form-control form-control-sm form-control-line" type="text">
									</div>
								</div>
								<div class="text-right">
									<button class="btn btn-primary">Search</button>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="header-right">
			<div class="dashboard-setting user-notification">
				<div class="dropdown">
					<a class="dropdown-toggle no-arrow" href="javascript:;" data-toggle="right-sidebar">
						<i class="dw dw-settings2"></i>
					</a>
				</div>
			</div>
			
			<div class="user-info-dropdown">
				<div class="dropdown">
					<a class="dropdown-toggle" href="#" role="button" data-toggle="dropdown">
						<span class="user-icon">
							<img src="./resources/vendors/images/profile_pic.jpg" alt="">
						</span>
						<span class="user-name">Admin</span>
					</a>
					<div class="dropdown-menu dropdown-menu-right dropdown-menu-icon-list">
						<a class="dropdown-item" href="#"><i class="dw dw-user1"></i> Profile</a>
						<a class="dropdown-item" href="profile.html"><i class="dw dw-settings2"></i> Setting</a>
					
						<a class="dropdown-item" href="/LGDataDiary/"><i class="dw dw-logout"></i> Log Out</a>
					</div>
				</div>
			</div>
			
		</div>
	</div>

	<div class="right-sidebar">
		<div class="sidebar-title">
			<h3 class="weight-600 font-16 text-blue">
				Layout Settings
				<span class="btn-block font-weight-400 font-12">User Interface Settings</span>
			</h3>
			<div class="close-sidebar" data-toggle="right-sidebar-close">
				<i class="icon-copy ion-close-round"></i>
			</div>
		</div>
		<div class="right-sidebar-body customscroll">
			<div class="right-sidebar-body-content">
				<h4 class="weight-600 font-18 pb-10">Header Background</h4>
				<div class="sidebar-btn-group pb-30 mb-10">
					<a href="javascript:void(0);" class="btn btn-outline-primary header-white active">White</a>
					<a href="javascript:void(0);" class="btn btn-outline-primary header-dark">Dark</a>
				</div>

				<h4 class="weight-600 font-18 pb-10">Sidebar Background</h4>
				<div class="sidebar-btn-group pb-30 mb-10">
					<a href="javascript:void(0);" class="btn btn-outline-primary sidebar-light ">White</a>
					<a href="javascript:void(0);" class="btn btn-outline-primary sidebar-dark active">Dark</a>
				</div>

				

				<div class="reset-options pt-30 text-center">
					<button class="btn btn-danger" id="reset-settings">Reset Settings</button>
				</div>
			</div>
		</div>
	</div>

	<div class="left-side-bar">
		<div class="brand-logo">
			<a href="index.html">
				<img src="./resources/vendors/images/deskapp-logo.svg" alt="" class="dark-logo">
				<img src="./resources/vendors/images/deskapp-logo-white.svg" alt="" class="light-logo">
			</a>
			<div class="close-sidebar" data-toggle="left-sidebar-close">
				<i class="ion-close-round"></i>
			</div>
		</div>
		<div class="menu-block customscroll">
			<div class="sidebar-menu">
				<ul id="accordion-menu">
					<li class="dropdown">
						<a class="dropdown-toggle no-arrow" href="adminDashboard">
							<span class="micon dw dw-house-1"></span><span style="font-size: large; font-weight: bold;" class="mtext">Admin Dashboard</span>
						</a>
						
					</li>
					<li class="dropdown">
						<a class="dropdown-toggle no-arrow" href="LGcompleteProfile">
							<span class="micon dw dw-edit2"></span><span class="mtext">Add LG</span>
						</a>
					</li>
					<li class="dropdown">
						<a class="dropdown-toggle no-arrow" href="viewAllLG">
							<span class="micon dw dw-library"></span><span class="mtext">View All LG</span>
						</a>
					</li>
					<li>
						<a  class="dropdown-toggle no-arrow"  href="viewAllStudent">
							<span class="micon dw dw-calendar1"></span><span class="mtext">View Students</span>
						</a>
					</li>
				
					
					<li class="dropdown">
						<a class="dropdown-toggle no-arrow" href="addNotice">
							<span class="micon dw dw-right-arrow1"></span><span class="mtext">Add Notice</span>
						</a>
						
					</li>
					<li class="dropdown">
						<a  class="dropdown-toggle no-arrow" href="adminViewNotice">
							<span class="micon dw dw-browser2"></span><span class="mtext">View Notice</span>
						</a>
						
					</li>

					
				</ul>
			</div>
		</div>
	</div>
	<div class="mobile-menu-overlay"></div>

	
	<div class="main-container">
		<div class="pd-ltr-20">
			<div class="card-box pd-20 height-100-p mb-30">
				<div class="row align-items-center">
					<div class="col-md-4">
						<img src="./resources/vendors/images/banner-img.png" alt="">
					</div>
					<div class="col-md-8">
						<h4 class="font-20 weight-500 mb-10 text-capitalize">
							Welcome back... <div class="weight-600 font-30 text-blue">Admin</div>
							
						</h4>
						<p class="font-18 max-width-600">Our Features : <br> > Effortless Device Management. <br> > Real-time Monitoring. <br> > User-Friendly Interface. <br> > Instant Updates. </b> </p>
					</div>
				</div>
			</div>
			
		 <!-- Export Datatable start -->
				<div class="card-box mb-30">
					<div class="pd-20">
						<h4 class="text-blue h4">View All Students</h4>
					</div>
					<div class="pb-20">
					  <br>
			        <%-- Display account details if available --%>
			       
						<table class="table hover multiple-select-row data-table-export nowrap">
							<thead>
							<tr>
							    <th class="text-left">Notice ID</th>
							    <th class="text-left">Title</th>
								<th class="text-left">Date</th>
								<th class="text-left">Description</th>
								<th class="text-left">Delete Notice</th>
							</tr>
							</thead>
							<tbody>
					<%
						List<Notice> list = (List<Notice>) request.getAttribute("listkey");
				    	
				        for(Notice notice : list)
				        {
				    %> 
				    
				    <tr>
				        <td class="text-left"><%=notice.getNoticeId() %></td>
						<td class="text-left"><%=notice.getNoticeTitle() %></td>
						<td class="text-left"><%=notice.getNoticeDate() %></td>
						<td class="text-left"><%=notice.getNoticeDescription() %></td>
						
						<td><a href="deleteNotice/<%=notice.getNoticeId() %>">Delete</a></td>
					
					</tr>
				       	
				     <% 	
				        }		
					%>
							</tbody>
						
						</table>
					</div>
				</div>
				<!-- Export Datatable End -->
		 
		 
			
			<div class="footer-wrap pd-20 mb-20 card-box">
				LG Data Dairy - Developed by <a href="https://github.com/Harsh76200" target="_blank">Harsh Jain</a>
			</div>
		</div>
	</div>
	
	<!-- js -->
	<script src="./resources/vendors/scripts/core.js"></script>
	<script src="./resources/vendors/scripts/script.min.js"></script>
	<script src="./resources/vendors/scripts/process.js"></script>
	<script src="./resources/vendors/scripts/layout-settings.js"></script>
	<script src="./resources/src/plugins/apexcharts/apexcharts.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/jquery.dataTables.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/dataTables.bootstrap4.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/dataTables.responsive.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/responsive.bootstrap4.min.js"></script>
	<script src="./resources/vendors/scripts/dashboard.js"></script>
	<!-- js -->
	<script src="./resources/vendors/scripts/core.js"></script>
	<script src="./resources/vendors/scripts/script.min.js"></script>
	<script src="./resources/vendors/scripts/process.js"></script>
	<script src="./resources/vendors/scripts/layout-settings.js"></script>
	<script src="./resources/src/plugins/datatables/js/jquery.dataTables.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/dataTables.bootstrap4.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/dataTables.responsive.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/responsive.bootstrap4.min.js"></script>
	<!-- buttons for Export datatable -->
	<script src="./resources/src/plugins/datatables/js/dataTables.buttons.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/buttons.bootstrap4.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/buttons.print.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/buttons.html5.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/buttons.flash.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/pdfmake.min.js"></script>
	<script src="./resources/src/plugins/datatables/js/vfs_fonts.js"></script>
	<!-- Datatable Setting js -->
	<script src="./resources/vendors/scripts/datatable-setting.js"></script>
</body>
</html>