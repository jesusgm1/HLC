<%-- 
    Document   : index
    Created on : 28-nov-2022, 14:25:03
    Author     : alejandro
--%>

<%@page import="modelo.listamensajes"%>
<%@page import="modelo.lista"%>
<%@page import="modelo.mensaje"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenida!</h1>
        <%   String usuario = (String) session.getAttribute("logueado");

           if (session.isNew() && usuario == null) {
           ArrayList<mensaje> lista=new listamensajes();
           lista.add(new mensaje("Admin","Bienvido al foro"));
           session.setAttribute("lista",lista);
        %>
        <form name="formulario1" action="s1" method="post">
            <p> <input type="input" name="usuario">
            <p> <input type="password" name="pass">
                <button type="submit" name="boton1" value="Entrar"> Entrar</button> 
            </p>
        </form>


        <%} else if (usuario.equals("usuarioFalso")) {

        %>
        <form name="formulario1" action="s1" method="post">
            <p> <input type="input" name="usuario">
            <p> <input type="password" name="pass">
                <button type="submit" name="boton1" value="Entrar"> Entrar</button> 
            </p>
        </form>


        <%};
        %>












    </body>
</html>
