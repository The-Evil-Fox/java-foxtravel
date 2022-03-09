<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="../templates/head.jsp"%>
<title>Fox Travel | Sri-lanka</title>
</head>
<body>
	<%@include file="../templates/navbar.jsp"%>
	<div id="content">
		<section id="sri-lanka">
			<!-- Slideshow container -->
			<div class="slideshow-container">
				<!-- Full-width images with number and caption text -->
				<div class="mySlides fade">
					<div class="numbertext">1 / 3</div>
					<img src="https://cdn.getyourguide.com/img/country/5c612f6df25bd.jpeg/88.jpg">
					<div class="slidetext">Caption Text</div>
				</div>

				<div class="mySlides fade">
					<div class="numbertext">2 / 3</div>
					<img src="https://www.tracedirecte.com/uploads/Image/d9/IMF_WEBZINE/GAB_TRACEDIRECTE/5787_790_jungle-sri-lanka.jpg">
					<div class="slidetext">Caption Two</div>
				</div>

				<div class="mySlides fade">
					<div class="numbertext">3 / 3</div>
					<img src="https://wildroad.fr/wp-content/uploads/2019/11/voyager-femme-seule-sri-lanka.jpg">
					<div class="slidetext">Caption Three</div>
				</div>
			</div>
		</section>
	</div>
	<script>
	
		var slideIndex = 0;
		showSlides();

		function showSlides() {

			var i;
			var slides = document.getElementsByClassName("mySlides");
			
			for (i = 0; i < slides.length; i++) {
				
				slides[i].style.display = "none";
				
			}
			
			slideIndex++;
			
			if (slideIndex > slides.length) {
				
				slideIndex = 1
				
			}
			
			slides[slideIndex - 1].style.display = "block";
			setTimeout(showSlides, 4000); // Change image every 4 seconds
			
		}
		
	</script>
	<%@include file="../templates/footer.jsp"%>
</body>
</html>