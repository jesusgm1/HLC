<%-- 
    Document   : apunte
    Created on : 21-nov-2022, 14:41:48
    Author     : Usuario359
--%>

<%@page contentType="text/html" pageEncoding="Shift_JIS"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
        <title>JSP Page</title>
    </head>
    <body>
          <p>Eliga la dimension de la matriz</p>
        <form action="s3" method="POST">
            <select name="FC">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="5">5</option>
                <option value="7">7</option>
            </select>
            <br>
            <input type="submit" value="Enviar" class="default">
        </form>
        <%
            String mensaje=(String)request.getAttribute("mensaje");
            if(mensaje != null) {
                out.println(mensaje);
            }
        %>
    </body>
</html>
