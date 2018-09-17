<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Loading file</title>
    <%@ page isELIgnored="false" %>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>
<body>

<br>
<br>
<br>
<h2>
    Upload file:
</h2>
<form:form method="POST" action="loadFile" enctype="multipart/form-data" cssClass="center_align">
    <input type="file" name="file" class="btn success"/><br><br>
    <input type="submit" value="Submit" class="btn success"/>
</form:form>

<br><br>
<h2>
    Example files for upload:
</h2>


<p style="text-align:center">TXT which is actually a GIF:</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/g1.txt" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/icons/gif-icon.png" width="100" height="100">
    </a>
</p>

<p style="text-align:center">GIF file</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/g2.gif" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/icons/gif-icon.png" width="100" height="100">
    </a>
</p>

<p style="text-align:center">GIF which is actually JPG</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/j1.jpg.gif" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/icons/gif-icon.png" width="100" height="100">
    </a>
</p>

<p style="text-align:center">JPG file</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/j2.jpg" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/icons/jpg.png" width="100" height="100">
    </a>
</p>

<p style="text-align:center">PNG file</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/peeng.png" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/file_icon.png" width="100" height="100">
    </a>
</p>

<p style="text-align:center">UTF8 TXT file</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/UTF8.txt" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/file_icon.png" width="100" height="100">
    </a>
</p>

<p style="text-align:center">UTF16 Big Endian TXT file</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/UTF16_big.txt" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/file_icon.png" width="100" height="100">
    </a>
</p>

<p style="text-align:center">UTF16 Little Endian TXT file</p>
<p>
    <a href="${pageContext.request.contextPath}/resources/files/UTF16_little.txt" download >
        <img class="center_align" border="0" src="${pageContext.request.contextPath}/resources/file_icon.png" width="100" height="100">
    </a>
</p>

</body>
</html>
