<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student form fill it up !!</title>
<style> error{color:red;}</style>
</head>
<body>
<hr>
<form:form action="processForm" modelAttribute="student">
FirstName:<form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"></form:errors>
<br><br>
LastName(*):<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
No of Way:<form:input path="noWay"/>
<form:errors path="noWay" cssClass="error"></form:errors>
<br><br>
Course Code:<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"></form:errors>
<br><br>
<p>dropdownlist</p>
Country:<form:select path="country">
	<form:options items="${student.countryOpt}"/>
</form:select>
<br><br>
favourite language 
java:<form:radiobutton path="favLanguage" value="java"/>
c:<form:radiobutton path="favLanguage" value="c"/>
c++:<form:radiobutton path="favLanguage" value="c++"/>
ruby:<form:radiobutton path="favLanguage" value="ruby"/>
<br><br>
Operating System
window:<form:checkbox path="favOs" value="window"/>
MacOs:<form:checkbox path="favOs" value="macos"/>
Linux:<form:checkbox path="favOs" value="linux"/>

<input type="submit" value="submit"/>
</form:form>
</body>
</html>