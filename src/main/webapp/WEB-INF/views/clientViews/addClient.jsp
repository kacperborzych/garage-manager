<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add client</title>
</head>
<body>
<h1>Add new client</h1>
<f:form method="post" modelAttribute="clientForm">

    <p>
        Username:<br>
        <f:input path="name"/>
        <f:errors path="name"/>
    </p>

    <p>
        Password: <br>
        <f:input path="surname"/>
        <f:errors path="surname"/>
    </p>


    <p>
        First Name:<br>
        <f:input path="carModel"/>
        <f:errors path="carModel"/>
    </p>
    <p>
        Last Name:<br>
        <f:input path="licensePlate"/>
        <f:errors path="licensePlate"/>
    </p>
    <p>
        Hobbies:<br>
        <f:input path="phoneNumber"/>
        <f:errors path="phoneNumber"/>
    </p>
    <p>
        Age:<br>
        <f:input type="number" path="discount"/>
        <f:errors path="discount"/>
    </p>

    <button type="submit">Add</button>
</f:form>

<p>
    <a href="<c:url value="/"/>">
        Back to the main page
    </a>
</p>

</body>
</html>
