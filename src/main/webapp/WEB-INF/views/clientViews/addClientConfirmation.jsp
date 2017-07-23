<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Client added !</title>
</head>
<body>
<h2>Success!</h2>
<p>
    Client ${client.name} ${client.surname} just added.<br>
</p>

<p>
    <a href="<c:url value="/"/>">
        Back to the main page
    </a>
</p>


</body>
</html>
