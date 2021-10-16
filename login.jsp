<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Форма авторизации</title>
</head>

<body>
    <jsp:include page="header.jsp"></jsp:include>

    <h1>Форма авторизации</h1>
    <form action="logging" method="post">
        <input name="login" type="text" placeholder="Логин"><br><br>
        <input name="password" type="password" placeholder="Пароль"><br><br>
        <input type="submit" value="Вход">
    </form>

    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>