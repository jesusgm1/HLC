<%-- 
    Document   : vistaAdmin
    Created on : 30-nov-2022, 12:23:02
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vista Admin!</h1>
        <%
        String usuario=(String)session.getAttribute("logueado");
        out.println(usuario);
         %>
    </body>
</html>
