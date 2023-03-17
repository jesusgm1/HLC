<%-- 
    Document   : index
    Created on : 11-ene-2023, 10:48:34
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
        <h1>Gestion de Cookies</h1>
        <form name="formulario1" method="POST" action="">
            Nombre de la cookie<input type="text" name="nombre">
            <br>
            Valor de la cookie<input type="text" name="valor">
            <br>
            <input type="submit" name="crear" value="Crear">
            <input type="submit" name="visualizar" value="Visualizar">
            <input type="submit" name="modificar" value="Modificar">
            <input type="submit" name="borrar" value="Borrar">
        </form>
        <%
            if (request.getParameter("crear") != null) {
                String nombre = request.getParameter("nombre");
                String valor = request.getParameter("valor");
                Cookie creada = new Cookie(nombre, valor);
                response.addCookie(creada);
            }
            if (request.getParameter("visualizar") != null) {
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie c : cookies) {
                        out.println(c.getName() + " " + c.getValue() + "<br>");
                    }
                }
            }
            if (request.getParameter("modificar") != null) {
                String nombre = request.getParameter("nombre");
                String valor = request.getParameter("valor");
                 Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie c : cookies) {
                        if(c.getName().equals(nombre)) {
                            c.setValue(valor);
                            response.addCookie(c);
                        }
                    }
                }
            }
            if (request.getParameter("borrar") != null) {
                String nombre = request.getParameter("nombre");
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie c : cookies) {
                        if(c.getName().equals(nombre)) {
                            c.setMaxAge(0);
                            response.addCookie(c);
                        }
                    }
                }
            }
        %>
    </body>
</html>