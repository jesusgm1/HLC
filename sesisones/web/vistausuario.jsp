<%-- 
    Document   : vistausuario
    Created on : 30-nov-2022, 12:10:29
    Author     : alejandro
--%>

<%@page import="modelo.listamensajes"%>
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
        
        <%
        String usuario=(String)session.getAttribute("logueado");
        %>
        <h1>Vista <%=usuario%></h1><%
        ArrayList<mensaje> lista=new listamensajes();        
        lista=(ArrayList<mensaje>)session.getAttribute("lista");
        
        for(mensaje m:lista)
        out.println(m.getAutor()+",   "+m.getMens()+"<br>");

         %>
        <form name="formulario1" action="AnadirMensaje" method="post">
        <p> <input type="text" max=255 name="mensaje">
        <button type="submit" name="boton1" value="Enviar">Enviar</button> 
        </p>
        </form>
         <form name="formulario2" action="cerrar" method="post">
        
        <button type="submit" name="cerrar" value="cerrar">Cerrar</button> 
        </p>
        </form>
        
    </body>
</html>
