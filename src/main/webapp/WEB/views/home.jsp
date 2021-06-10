<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 6/10/2021
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Từ Điển đơn giản</h1>
<form method="post">
    <div>
        <span>Từ tìm kiếm</span>
        <input type="text" name="key" value="${key}"/>

    </div>
    <div>
        <span>Kết quả</span>
        <input type="text" name="result" value="${result}" disabled/>

    </div>

    <button type="submit">Tìm kiếm</button>
    <c:if test="${result.equals('')}">
        <h3 style="color: red">Not found ${key}</h3>
    </c:if>
</form>



</body>
</html>
