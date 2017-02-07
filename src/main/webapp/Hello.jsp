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


    <p>Напиши свое имя:  <input type="text" name="str1" id="inp"></p>

    <p><input value="Кнопка?" onclick="reverse()" type="button" />



<div id="stus">Реверсированная строка</div>
<script>

    function reverse() {
        var req = new XMLHttpRequest();
        var statusElem = document.getElementById('stus');
        req.open('Post', 'MyServlet', true);
        var inputvalue=document.getElementById("inp").value.toString();
        req.send(inputvalue); // отослать запрос

        req.onreadystatechange = function() {

                statusElem.innerHTML = req.responseText ;  //ответ

            }
        }
       // statusElem.innerHTML = 'Ожидаю ответа ...'


</script>

</body>
</html>

