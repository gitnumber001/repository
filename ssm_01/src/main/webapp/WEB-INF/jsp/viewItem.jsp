<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/7/11
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello maven</h1>
<form>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>pic</th>
        <th>createtime</th>
        <th>detail</th>

    </tr>
    <tr>
        <td>${items.id}</td>
        <td>${items.name}</td>
        <td>${items.price}</td>
        <td>fmt:formatDate value = "${items.createtime}" pattern="yyyy-MM-dd HH:mm:ss:"</td>
     <%--   <fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>--%>
        <td>${items.createtime}</td>
        <td>${items.detail}</td>

    </tr>
</table>




</form>

${items.name}
</body>
</html>
