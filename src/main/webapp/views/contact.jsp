<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<%@include file="../templates/head.jsp" %>
	<title>Fox Travel | Contact</title>
</head>
<body>
	<%@include file="../templates/navbar.jsp" %>
	<div id="content">
		<section id="contact">
			<c:if test="${error != null}">
				<h1 class="error-message"><c:out value="${error}"/></h1>
			</c:if>
			<c:if test="${confirmation != null}">
				<h1 class="confirmation-message"><c:out value="${confirmation}"/></h1>
			</c:if>
			<div class="form-container flex-row">
				<form id="form-contact" method="POST" action="contact" class="animated-gradient">
					<div class="input-group">
						<label for="input-1">Name:</label>
						<input placeholder="Your name...." type="text" name="name" required />
					</div>
					<div class="input-group">
						<label for="input-1">Firstname:</label>
						<input placeholder="Your firstname..." type="text" name="firstname" required />
					</div>
					<div class="input-group">
						<label for="input-1">Email adress:</label>
						<input placeholder="Your email adress..." type="email" name="email" required />
					</div>
					<div class="input-group">
						<label for="input-1">Votre message:</label>
						<textarea rows="10" cols="5" name="message" placeholder="Your message..."  required ></textarea>
					</div>
					<input type="submit" value="Envoyer" />
				</form>
				<div class="form-infos">
					<span>Fox travel</span>	
					<span>3517 W.Gray St.</span>
					<span>Utica, Pennsylvania</span>
					<span>57867</span>
					<span>+1 (209) 555-0104</span>
					<span>FoxTravel@gmail.com</span>
				</div>
			</div>
		</section>
	</div>
	<%@include file="../templates/footer.jsp" %>
</body>
</html>