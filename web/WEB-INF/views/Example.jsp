<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 3/23/2019
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/my-test.css">
    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>
    <h2>Spring MVC Demo - Home Page</h2>
    <a href="hello">Plain Hello World</a>
    <br><br>
    <img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" />
    <br><br>
    <input type="button" onclick="doSomeWork()" value="Click Me"/>
</body>
</html>

