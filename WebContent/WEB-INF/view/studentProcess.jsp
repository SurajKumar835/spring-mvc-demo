<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>
Student Details Entered!!</title></head>
<body>
	That is :${student.firstName} ${student.lastName}
	<br><br>
	Country :${student.country}
	<br><br>
	fav Language:${student.favLanguage}
	<br><br>
	fav OS:
	<ul>
	<c:forEach var="temp" items="${student.favOs}">
	<li>${temp}</li>
	</c:forEach>	
	</ul>
</body>
</html>