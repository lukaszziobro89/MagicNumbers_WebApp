<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/my-test.css">
    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
    <link rel="icon" type="image/png" href="resources/spring_icon.png" sizes="32x32">
</head>
<body>
<h2>
    Magic numbers - file differentiator
</h2>
<p style="text-align:center;">
    <img src="${pageContext.request.contextPath}/resources/images/spring_logo.png"/>
</p>


<form class="center_align" action="showLoadFileForm"><input type="submit" class="btn success" value="Load file for check"/></form>

<br>
<br>

<p style="text-align:center;">
    <input type="submit" onclick="printTime()" value="Get time"/>
</p>

<br>
<p style="text-align:center;">
    <img src="${pageContext.request.contextPath}/resources/images/mnum.jpg" sizes="313x238"/>
</p>

</body>
</html>
