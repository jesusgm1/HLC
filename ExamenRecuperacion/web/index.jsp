<%-- 
    Document   : index.jsp
    Created on : 09-mar-2023, 10:38:17
    Author     : Usuario359
--%>

<%@page contentType="text/html" pageEncoding="Shift_JIS"%>
<!DOCTYPE html>
<html>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
        <title>Mini Calculadora</title>
    </head>
    <body>
        <h1>Mini Calculadora</h1>
        <form name="formulario1" method="POST" action="s1">
            Numero 1:<input type="text" name="numero1">
            <br>
            Numero 2:<input type="text" name="numero2">
            <br>
            <input type="submit" name="suma" value="Suma">
            <input type="submit" name="multiplica" value="Multiplica">
        </form>
</html>
