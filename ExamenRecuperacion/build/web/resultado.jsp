<%-- 
    Document   : resultado
    Created on : 09-mar-2023, 11:05:31
    Author     : Usuario359
--%>

<%@page contentType="text/html" pageEncoding="Shift_JIS"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
        <title>Resultado de la cuenta</title>
    </head>
    <body>
        <%
            String numero1 = (String) session.getAttribute("Factor1");
            String numero2 = (String) session.getAttribute("Factor2");
            String sumar = (String) session.getAttribute("Suma");
            String multiplicar = (String) session.getAttribute("Multiplica");
            if (sumar != null) {
                int suma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                out.println(suma);
            }
            if (multiplicar != null) {
                int multiplica = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                out.println(multiplica);
            }
        %>
        <form name="formulario2" method="POST" action="s2">
            <input type="submit" name="volver atras" value="Atras">
        </form>
    </body>
</html>
