<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=windows-1251" %>
<%@ page import="java.util.*, java.text.*" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
</head>

<body>
<form action="HelloWorld",  method="Get">
    <p>Напиши свое имя: <input type="text" name="username"></p>

<button> Ссылка на приветствие для тебя, метод гет</button>

</form>
    <form action="MyServlet",  method="post">
        <p>Напиши свое имя:  <input type="text" name="str"></p>

        <button>Ссылка на приветствие для тебя, метод пост с реверсом</button>



    </form>
</body>

</html>

